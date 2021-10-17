package com.bcopstein.sistemasDeVenda.adaptadores.repositorios;

import java.util.List;

import com.bcopstein.sistemasDeVenda.negocio.entidades.ItemCarrinho;
import com.bcopstein.sistemasDeVenda.negocio.repositorios.IItemCarrinhoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemCarrinhoRepository implements IItemCarrinhoRepository {
    
    private IItemCarrinhoCRUD itemCarrinhoCRUD;

    @Autowired
    public ItemCarrinhoRepository(IItemCarrinhoCRUD itemCarrinhoCRUD) {
        this.itemCarrinhoCRUD = itemCarrinhoCRUD;
    }

    public List<ItemCarrinho> todos() {
        List<ItemCarrinho> response = itemCarrinhoCRUD.findAll();
        return response;
    }

    public void removeTodos() {
        itemCarrinhoCRUD.deleteAll();
    }

    public boolean cadastra(ItemCarrinho itemCarrinho) {
        itemCarrinhoCRUD.save(itemCarrinho);
        return true;
    }

}
