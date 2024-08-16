package com.phuoc.shop.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.multipart.MultipartFile;

public class ProductCreationProduct {
    private int Id_product;
    private double id_user;
    private double id_category;
    private String name;
    private MultipartFile image;
    private String describes;
    private double price;
    private double promotional_price;
    private String date;
    private double quantity;
    private double sold;
    private double status;

    public int getId_product() {
        return Id_product;
    }

    public void setId_product(int id_product) {
        Id_product = id_product;
    }

    public double getId_user() {
        return id_user;
    }

    public void setId_user(double id_user) {
        this.id_user = id_user;
    }

    public double getId_category() {
        return id_category;
    }

    public void setId_category(double id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPromotional_price() {
        return promotional_price;
    }

    public void setPromotional_price(double promotional_price) {
        this.promotional_price = promotional_price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }
}
