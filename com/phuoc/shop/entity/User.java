package com.phuoc.shop.entity;
import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Sử dụng IDENTITY cho kiểu int auto-increment
    private String Id_user;
    @JsonProperty("name") // Đảm bảo rằng trường "userName" được ánh xạ thành "username" trong JSON
    private  String name;
    private  String password;
    private String email;
    private String role;
    private String date;
    private String image;
    private String address;
    private String information;
    private String id_from;
    private String namereal;
    private double status;

    public String getId_user() {
        return Id_user;
    }

    public void setId_user(String id_user) {
        Id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getID_from() {
        return id_from;
    }

    public void setID_from(String ID_from) {
        this.id_from = ID_from;
    }

    public String getNamereal() {
        return namereal;
    }

    public void setNamereal(String namereal) {
        this.namereal = namereal;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }
}
