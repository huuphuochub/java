package com.phuoc.shop.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.phuoc.shop.dto.request.ProductCreationProduct;
import com.phuoc.shop.entity.Product;
import com.phuoc.shop.repository.ProductRepository;
import com.phuoc.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    List<Product> getProduct(){
        return productService.getAllproduct();
    }



    @PostMapping()
    public ResponseEntity<Product> addProduct(@ModelAttribute ProductCreationProduct request,
                                              @RequestParam("imageFile") MultipartFile imageFile) {
        try {
            Product product = productService.createProduct(request, imageFile);
            return ResponseEntity.status(HttpStatus.CREATED).body(product);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = productService.getProductById(id);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id,
                                                 @ModelAttribute ProductCreationProduct request,
                                                 @RequestParam(value = "imageFile", required = false) MultipartFile imageFile) {
        try {
            Product updatedProduct = productService.updateProductByid(id, request, imageFile);
            return updatedProduct != null ? ResponseEntity.ok(updatedProduct) : ResponseEntity.notFound().build();
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}
