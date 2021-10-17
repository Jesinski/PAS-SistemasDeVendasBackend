package com.bcopstein.sistemasDeVenda.aplicação.casosDeUso;

import com.bcopstein.sistemasDeVenda.negocio.entidades.ItemCarrinho;
import com.bcopstein.sistemasDeVenda.negocio.servicos.ServicoItemCarrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraItemCarrinhosUC {
    private ServicoItemCarrinho servicoItemCarrinho;

    @Autowired
    public CadastraItemCarrinhosUC(ServicoItemCarrinho servicoItemCarrinho) {
        this.servicoItemCarrinho = servicoItemCarrinho;
    }

    public void run(ItemCarrinho itemCarrinho) {
        servicoItemCarrinho.cadastraProduto(itemCarrinho);
    }
}
