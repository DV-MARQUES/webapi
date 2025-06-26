package com.jkalango.webapi.jogadores;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name="jogador")
@Entity(name="jogador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Jogador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String nome;
      private String nickName;
      private String email;
      private String telefone;
      private String senha;

      public Jogador(DadosCadastroJogador dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.nickName = dados.nickname();
        this.telefone = dados.telefone();
        this.senha = dados.senha();

      }
}
