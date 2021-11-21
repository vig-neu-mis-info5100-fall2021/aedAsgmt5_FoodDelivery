/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Restaurant;

import java.awt.Image;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class Dish {
    private String name;
    private String price;
    private Image picture;
    private String description;

    public Dish(String name,String description,String price) {
        this.name=name;
        this.price=price;
        this.description=description;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
