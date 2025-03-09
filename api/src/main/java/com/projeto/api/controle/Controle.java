package com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.modelo.Pessoa;
import com.projeto.api.repositorio.Repositorio;

@RestController
public class Controle {

  @Autowired
  private Repositorio acao;

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

  @PostMapping("/pessoa")
  public Pessoa pessoa(@RequestBody Pessoa p) {
    return p;
  }

}
