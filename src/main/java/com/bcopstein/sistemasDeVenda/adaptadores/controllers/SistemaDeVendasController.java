// package com.bcopstein.adaptadores.controllers;

// import com.bcopstein.aplicação.casosDeUso.CadastraProdutosUC;
// import com.bcopstein.negocio.entidades.Produto;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/api")
// public class SistemaDeVendasController {
//     private CadastraProdutosUC cadastraProdutosUC;

//     @Autowired
//     public SistemaDeVendasController(CadastraProdutosUC cadastraProdutosUC) {
//         this.cadastraProdutosUC = cadastraProdutosUC;
//     }

//     @PostMapping("/produto")
//     @CrossOrigin(origins = "*")
//     public boolean cadastraProduto(@RequestBody final Produto produto) {
//         cadastraProdutosUC.run(produto);
//         return true;
//     }
// }
