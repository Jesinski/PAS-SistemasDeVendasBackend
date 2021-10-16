package com.bcopstein.sistemasDeVenda.adaptadores.repositorios;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.Produto;
import com.bcopstein.sistemasDeVenda.negocio.repositorios.IProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdutoRepository implements IProdutoRepository {

    private IProdutoCRUD produtoCRUD;

    @Autowired
    public ProdutoRepository(IProdutoCRUD produtoCRUD) {
        this.produtoCRUD = produtoCRUD;
    }

    public List<Produto> todos() {
        List<Produto> response = produtoCRUD.findAll();
        return response;
    }

    public void removeTodos() {
        produtoCRUD.deleteAll();
    }

    public boolean cadastra(Produto produto) {
        produtoCRUD.save(produto);
        return true;
    }

}
