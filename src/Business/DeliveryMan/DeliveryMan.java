/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.Dish;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class DeliveryMan {

    private String Name;
    private String UserName;
    private Image picture;
    private ArrayList<Order> orderList;
    private String address;
    private String number;

    public DeliveryMan(String UserName) {
        this.UserName = UserName;
        orderList = new ArrayList<Order>();
    }
    
    @Override
    public String toString() {
        return UserName;
    }
    
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Dish> Order, String cost, String deliveryAddress) {
        Order o = new Order();
        //o.setOrder_id(String.valueOf(id));
        o.setCustomerName(customerName);
        o.setRestaurentName(restaurentName);
        o.setDeliverMan(deliverMan);
        o.setOrder(Order);
        o.setCost(cost);
        o.setDeliveryAddress(deliveryAddress);
        o.setStatus("New Order");
        orderList.add(o);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
