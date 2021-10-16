package com.bcopstein.sistemasDeVenda.negocio.repositorios;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.Produto;

public interface IProdutoRepository {
    List<Produto> todos();
    void removeTodos();
    boolean cadastra(Produto produto);
}
