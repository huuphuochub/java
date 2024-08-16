package com.phuoc.shop.controller;

import com.phuoc.shop.dto.request.CategoryCreationRequest;
import com.phuoc.shop.entity.Category;
import com.phuoc.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorys")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping()
    Category addCategory(@RequestBody CategoryCreationRequest request) {
        return categoryService.createCategory(request);
    }
    @GetMapping()
    List<Category> getCategory(){
        return categoryService.getAllcategory();
    }
    Category getCategoryByid(int id){
        return categoryService.getCategoryByid(id);
    }
}
