package com.bcopstein.sistemasDeVenda.adaptadores.repositorios;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.ItemCarrinho;

import org.springframework.data.repository.CrudRepository;

public interface IItemCarrinhoCRUD extends CrudRepository<ItemCarrinho, Integer> {
    List<ItemCarrinho> findAll();
    List<ItemCarrinho> findByCodigo(int codigo);
}
