package com.lambazon.service;

import com.lambazon.model.Product;
import com.lambazon.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class ProductService {

	@Autowired
    private ProductRepository productRepository;


    public void save(Product product) {
        productRepository.save(product);
    }

   
    public List<Product> getAll() {
        return productRepository.findAll();
    }
    
    public Product getById(String id) {
        return productRepository.getOne(id);
    }


    public void delete(String id) {
        productRepository.deleteById(id);
    }
}
