package com.bcopstein.sistemasDeVenda.negocio.repositorios;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.ItemCarrinho;

public interface IItemCarrinhoRepository {
    List<ItemCarrinho> todos();
    void removeTodos();
    boolean cadastra(ItemCarrinho itemCarrinho);
}
