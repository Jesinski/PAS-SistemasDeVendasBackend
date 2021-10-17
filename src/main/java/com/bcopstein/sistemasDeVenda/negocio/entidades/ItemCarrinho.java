package com.bcopstein.sistemasDeVenda.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemCarrinho {
  @Id
  private int codigo;
  private int quantidade;

  public ItemCarrinho(){}
  
  public ItemCarrinho(int codigo, int quantidade) {
    this.codigo = codigo;
    this.quantidade = quantidade;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return "ItemCarrinho [codigo=" + codigo + ", qtd=" + quantidade + "]";
  }
}
