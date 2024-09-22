package org.example.productsapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Product {
    @Id
    private long id;
    private String name;
    private int quantity;
    private String description;
    private double price;

    public Product(long id,String name,int quantity,String description,double price){
        this.id =id;
        this.name =name;
        this.quantity=quantity;
        this.description=description;
        this.price=price;
    }
    public Product(){}

    public void setId(long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
