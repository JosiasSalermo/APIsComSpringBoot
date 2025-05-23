package com.projeto.api.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.api.modelo.Pessoa;
import com.projeto.api.repositorio.Repositorio;

@RestController
public class Controle {

  @Autowired
  private Repositorio acao;

  @PostMapping("/api")
  public Pessoa cadastrar(@RequestBody Pessoa obj) {
    return acao.save(obj);
  }

  @GetMapping("/api")
  public List<Pessoa> seleconar() {
    return acao.findAll();
  }

  @GetMapping("/api/{codigo}")
  public Pessoa selecionarPeloCodigo(@PathVariable int codigo) {
    return acao.findByCodigo(codigo);
  }

  @PutMapping("/api")
  public Pessoa editar(@RequestBody Pessoa obj) {
    return acao.save(obj);
  }

  @DeleteMapping("/api/{codigo}")
  public void remover(@PathVariable int codigo) {
    Pessoa obj = selecionarPeloCodigo(codigo);

    acao.delete(obj);
  }

  @GetMapping("/api/contador")
  public long contador() {
    return acao.count();
  }

  public List<Pessoa> ordenarNomes() {
    return acao.findByOrderByNome();
  }

  @GetMapping("/api/ordenarNomes2")
  public List<Pessoa> ordenarNomes2() {
    return acao.findByNomeOrderByIdadeDesc("Tatiana");
  }

  @GetMapping("/api/nomeContem")
  public List<Pessoa> nomeContem() {
    return acao.findByNomeContaining("lu");
  }

  @GetMapping("")
  public String mensagem() {
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
