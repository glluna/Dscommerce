package br.com.luna.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.luna.dto.ProductDTO;
import br.com.luna.entities.Product;
import br.com.luna.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {	
		Product product = repository.findById(id).get();
		return new ProductDTO(product);
		
	}
}
