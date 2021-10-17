package com.bcopstein.sistemasDeVenda.adaptadores.controllers;

import java.util.List;

import com.bcopstein.sistemasDeVenda.aplicação.casosDeUso.CadastraItemCarrinhosUC;
import com.bcopstein.sistemasDeVenda.aplicação.casosDeUso.CadastraProdutosUC;
import com.bcopstein.sistemasDeVenda.aplicação.casosDeUso.ConsultaItemCarrinhosUC;
import com.bcopstein.sistemasDeVenda.aplicação.casosDeUso.ConsultaProdutosUC;
import com.bcopstein.sistemasDeVenda.negocio.entidades.ItemCarrinho;
import com.bcopstein.sistemasDeVenda.negocio.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SistemaDeVendasController {
    private CadastraProdutosUC cadastraProdutosUC;
    private ConsultaProdutosUC consultaProdutosUC;
    private CadastraItemCarrinhosUC cadastraItemCarrinhosUC;
    private ConsultaItemCarrinhosUC consultaItemCarrinhosUC;

    @Autowired
    public SistemaDeVendasController(CadastraProdutosUC cadastraProdutosUC, ConsultaProdutosUC consultaProdutosUC, CadastraItemCarrinhosUC cadastraItemCarrinhosUC, ConsultaItemCarrinhosUC consultaItemCarrinhosUC) {
        this.cadastraProdutosUC = cadastraProdutosUC;
        this.consultaProdutosUC = consultaProdutosUC;
        this.cadastraItemCarrinhosUC = cadastraItemCarrinhosUC;
        this.consultaItemCarrinhosUC = consultaItemCarrinhosUC;
    }

    @PostMapping("/produto")
    @CrossOrigin(origins = "*")
    public boolean cadastraProduto(@RequestBody final Produto produto) {
        cadastraProdutosUC.run(produto);
        return true;
    }

    @GetMapping("/produto")
    @CrossOrigin(origins = "*")
    public List<Produto> consultaProdutos() {
        return consultaProdutosUC.run();
    }
    
    @PostMapping("/itemCarrinho")
    @CrossOrigin(origins = "*")
    public boolean cadastraItemCarrinho(@RequestBody final ItemCarrinho itemCarrinho) {
        cadastraItemCarrinhosUC.run(itemCarrinho);
        return true;
    }

    @GetMapping("/itemCarrinho")
    @CrossOrigin(origins = "*")
    public List<ItemCarrinho> consultaItemCarrinhos() {
        return consultaItemCarrinhosUC.run();
    }
}
