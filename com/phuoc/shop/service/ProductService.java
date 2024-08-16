package com.phuoc.shop.service;

import com.phuoc.shop.dto.request.ProductCreationProduct;
import com.phuoc.shop.entity.Product;
import com.phuoc.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.phuoc.shop.service.CloundinaryService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CloundinaryService cloudinaryService;
    public List<Product> getAllproduct() {
        return productRepository.findAll();
    }
    public Product createProduct(ProductCreationProduct request, MultipartFile imageFile) throws IOException {
        String image = cloudinaryService.uploadFile(imageFile);


        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setImage(image);
        product.setId_category(request.getId_category());
        product.setDate(request.getDate());
        product.setId_user(request.getId_user());
        product.setPromotional_price(request.getPromotional_price());
        product.setQuantity(request.getQuantity());
        product.setSold(request.getSold());
        product.setStatus(0);
        product.setDescribes(request.getDescribes());
        product.setDate(request.getDate());

        return productRepository.save(product);

    }


    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null); // Trả về null nếu không tìm thấy sản phẩm
    }
    public Product updateProductByid(int id, ProductCreationProduct request, MultipartFile imageFile) throws IOException {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            product.setName(request.getName());
            product.setPrice(request.getPrice());
            if (imageFile != null && !imageFile.isEmpty()) {
                String image = cloudinaryService.uploadFile(imageFile);
                product.setImage(image); // Cập nhật link ảnh từ Cloudinary nếu có ảnh mới
            }
            product.setId_category(request.getId_category());
            product.setDate(request.getDate());
            product.setId_user(request.getId_user());
            product.setPromotional_price(request.getPromotional_price());
            product.setQuantity(request.getQuantity());
            product.setSold(request.getSold());
            product.setStatus(request.getStatus());
            product.setDescribes(request.getDescribes());
            return productRepository.save(product);
        } else {
            // Xử lý khi sản phẩm không tồn tại, bạn có thể ném ra ngoại lệ hoặc trả về giá trị mặc định
            return null;
        }
    }


}
