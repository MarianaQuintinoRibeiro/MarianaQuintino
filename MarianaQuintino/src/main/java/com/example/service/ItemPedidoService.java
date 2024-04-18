package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.ItemPedido;
import com.example.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository itempedidoRepository;

	public List<ItemPedido> getAllItemPedidos() {
		return itempedidoRepository.findAll();
	}

	public ItemPedido getItemPedidoById(long id) {
		return itempedidoRepository.findById(id).orElse(null);
	}

	public ItemPedido saveItemPedido(ItemPedido itempedido) {
		return itempedidoRepository.save(itempedido);
	}

}
