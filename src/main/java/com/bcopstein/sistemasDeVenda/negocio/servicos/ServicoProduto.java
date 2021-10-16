package com.bcopstein.sistemasDeVenda.negocio.servicos;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.Produto;
import com.bcopstein.sistemasDeVenda.negocio.repositorios.IProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoProduto {

    public IProdutoRepository produtoRepository;
    
    @Autowired
    public ServicoProduto(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> todos() {
        return produtoRepository.todos();
    }

    public void cadastraProduto(Produto produto) {
        produtoRepository.removeTodos();
        produtoRepository.cadastra(produto);
    }
}
