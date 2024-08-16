package com.phuoc.shop.service;

import com.phuoc.shop.dto.request.CategoryCreationRequest;
import com.phuoc.shop.entity.Category;
import com.phuoc.shop.entity.Product;
import com.phuoc.shop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> getAllcategory() {
            return categoryRepository.findAll();
    }
    public Category createCategory(CategoryCreationRequest request){
        Category category = new Category();
        category.setName(request.getName());

        return categoryRepository.save(category);
    }
    public Category getCategoryByid(int id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElse(null); // Trả về null nếu không tìm thấy sản phẩm
    }

}
