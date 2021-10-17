package com.bcopstein.sistemasDeVenda.aplicação.casosDeUso;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.ItemCarrinho;
import com.bcopstein.sistemasDeVenda.negocio.servicos.ServicoItemCarrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultaItemCarrinhosUC {
    private ServicoItemCarrinho servicoItemCarrinho;

    @Autowired
    public ConsultaItemCarrinhosUC(ServicoItemCarrinho servicoItemCarrinho) {
        this.servicoItemCarrinho = servicoItemCarrinho;
    }

    public List<ItemCarrinho> run() {
        return servicoItemCarrinho.todos();
    }
}
