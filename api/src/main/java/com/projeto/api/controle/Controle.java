package com.projeto.api.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

  @GetMapping("")
  public String mensagem() {
    return "Hello World!";
  }

}
