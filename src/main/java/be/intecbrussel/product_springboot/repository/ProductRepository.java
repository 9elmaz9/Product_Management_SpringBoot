package be.intecbrussel.product_springboot.repository;

import be.intecbrussel.product_springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}