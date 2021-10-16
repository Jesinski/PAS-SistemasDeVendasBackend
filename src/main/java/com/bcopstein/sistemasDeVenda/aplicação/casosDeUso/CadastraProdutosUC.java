package com.bcopstein.sistemasDeVenda.aplicação.casosDeUso;

import com.bcopstein.sistemasDeVenda.negocio.entidades.Produto;
import com.bcopstein.sistemasDeVenda.negocio.servicos.ServicoProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraProdutosUC {
    private ServicoProduto servicoProduto;

    @Autowired
    public CadastraProdutosUC(ServicoProduto servicoProduto) {
        this.servicoProduto = servicoProduto;
    }

    public void run(Produto produto) {
        servicoProduto.cadastraProduto(produto);
    }
}
