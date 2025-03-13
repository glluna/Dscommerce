package br.com.luna.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luna.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
