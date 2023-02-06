package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Product;
import com.axis.service.ProductService;

public class ProductController {
	
	@RestController
	@RequestMapping("api/v1")
	public class ProdcutController{
		
	}
	 @Autowired
	 ProductService productService;
	 
	 @PostMapping("/product")
	 ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.addProduct(product), HttpStatus.OK);
		 
	 }
	 
	 @GetMapping("/products")
	 ResponseEntity<List<Product>> getAllProducts(){
	 return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	 }
	 @GetMapping("/productbyid/{id}")
	 ResponseEntity<Product>getProductById(@PathVariable int id){
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
		 
	 }
	 @GetMapping("/productbyname/(name)")
	 ResponseEntity<Product>getProductByName(@PathVariable String name){
		return new ResponseEntity<Product>(productService.getProductByName(), HttpStatus.OK);
		 
	 }
	 @GetMapping("/productbycategory/(category)")
	 ResponseEntity<Product>getProductByCategory(@PathVariable String category){
		return new ResponseEntity<Product>(productService.getProductByCategory(), HttpStatus.OK);
		 
	 }
	 
	 

}
