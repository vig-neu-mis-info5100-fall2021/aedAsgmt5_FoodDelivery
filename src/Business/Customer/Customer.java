/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dish;
import java.util.ArrayList;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class Customer {

    private int id = 101;
    private String Name;
    public String UserName;
    private ArrayList<Order> orderList;
    private String address;
    private String number;

    public Customer(String UserName) {
        this.UserName = UserName;
        orderList = new ArrayList<Order>();
    }

    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Dish> orderItems, String cost, String deliveryAddress) {
        Order o = new Order();
        o.setOrder_id(String.valueOf(id));
        o.setCustomerName(customerName);
        o.setRestaurentName(restaurentName);
        o.setDeliverMan(deliverMan);
        o.setOrder(orderItems);
        o.setCost(cost);
        o.setDeliveryAddress(deliveryAddress);
        o.setStatus("New Order");
        orderList.add(o);
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
