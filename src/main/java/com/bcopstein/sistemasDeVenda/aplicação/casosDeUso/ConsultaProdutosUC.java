package com.bcopstein.sistemasDeVenda.aplicação.casosDeUso;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.Produto;
import com.bcopstein.sistemasDeVenda.negocio.servicos.ServicoProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaProdutosUC {
    private ServicoProduto servicoProduto;

    @Autowired
    public ConsultaProdutosUC(ServicoProduto servicoProduto) {
        this.servicoProduto = servicoProduto;
    }

    public List<Produto> run() {
        return servicoProduto.todos();
    }
}
