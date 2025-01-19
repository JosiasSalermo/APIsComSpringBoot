package com.projeto.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

  @GetMapping("")
  public String mensage() {
    return "Hello World!";
  }

  @GetMapping("/boasvindas")
  public String boasVindas() {
    return "Seja bem vindo(a)";
  }

  @GetMapping("/boasVindas/{nome}")
  public String boasVindas(@PathVariable String nome) {
    return "Sea bem vindo(a)" + nome;
  }

}
