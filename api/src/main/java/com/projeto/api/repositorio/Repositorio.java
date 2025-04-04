package com.projeto.api.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projeto.api.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

  List<Pessoa> findAll();

  Pessoa findByCodigo(int codigo);

  List<Pessoa> findByOrderByNome();

  List<Pessoa> findByNomeOrderByIdadeDesc(String nome);

  List<Pessoa> findByNomeContaining(String nome);
}
