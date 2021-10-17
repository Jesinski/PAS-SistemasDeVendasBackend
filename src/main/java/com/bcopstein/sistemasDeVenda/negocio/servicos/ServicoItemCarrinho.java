package com.bcopstein.sistemasDeVenda.negocio.servicos;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.ItemCarrinho;
import com.bcopstein.sistemasDeVenda.negocio.repositorios.IItemCarrinhoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoItemCarrinho { 

    public IItemCarrinhoRepository itemCarrinhoRepository;
    
    @Autowired
    public ServicoItemCarrinho(IItemCarrinhoRepository itemCarrinhoRepository) {
        this.itemCarrinhoRepository = itemCarrinhoRepository;
    }

    public List<ItemCarrinho> todos() {
        return itemCarrinhoRepository.todos();
    }

    public void cadastraProduto(ItemCarrinho itemCarrinho) {
        itemCarrinhoRepository.removeTodos();
        itemCarrinhoRepository.cadastra(itemCarrinho);
    }
}
