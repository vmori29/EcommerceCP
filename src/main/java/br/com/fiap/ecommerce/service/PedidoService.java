package br.com.fiap.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	   public List<Pedido> list() {
	        return repository.findAll();
	    }

	    public Pedido save(Pedido pedido) {        
	        return repository.save(pedido);
	    }

	    public boolean existsById(Long id) {        
	        return repository.existsById(id);
	    }

	    public void delete(Long id) {
	    	repository.deleteById(id);
	    }

	    public Optional<Pedido> findById(Long id) {
	        return repository.findById(id);
	    }
}
