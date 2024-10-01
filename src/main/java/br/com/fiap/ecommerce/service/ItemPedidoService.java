package br.com.fiap.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.ecommerce.model.ItemPedido;
import br.com.fiap.ecommerce.repository.ItemPedidoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository repository;
	
	
	   public List<ItemPedido> list() {
	        return repository.findAll();
	    }

	    public ItemPedido save(ItemPedido itemPedido) {        
	        return repository.save(itemPedido);
	    }

	    public boolean existsById(Long id) {        
	        return repository.existsById(id);
	    }

	    public void delete(Long id) {
	    	repository.deleteById(id);
	    }

	    public Optional<ItemPedido> findById(Long id) {
	        return repository.findById(id);
	    }
}