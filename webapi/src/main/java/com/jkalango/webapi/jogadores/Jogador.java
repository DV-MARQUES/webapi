package com.jkalango.webapi.jogadores;
import jakarta.pers;


@Table(name="jogador")
@Entity(name="jogador")
public class Jogador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTIY)
      private Long id;
      private String nome;
      private String nickName;
      private String email;
      private String telefone;
      private String senha;
}
