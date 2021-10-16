package com.bcopstein.sistemasDeVenda.adaptadores.repositorios;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.Produto;

import org.springframework.data.repository.CrudRepository;

public interface IProdutoCRUD extends CrudRepository<Produto, String> {
    List<Produto> findAll();
    List<Produto> findByCodigo(int codigo);
}
