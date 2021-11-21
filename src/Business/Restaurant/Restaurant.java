/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class Restaurant {
    
    private String adminUName;
    private Image picture;
    private ArrayList<Dish> Menu;
    private ArrayList<Order> orderList;
    int id=101;
    private String name;
    private String address;
    private String number;
    
    public Restaurant(String UName) {
        this.adminUName=UName;
        Menu=new ArrayList<Dish>();
        orderList=new ArrayList<Order>();
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Dish> Order, String cost, String deliveryAddress) {
        Order o=new Order();
        o.setOrder_id(String.valueOf(id));
        o.setCustomerName(customerName);
        o.setRestaurentName(restaurentName);
        o.setDeliverMan(deliverMan);
        o.setOrder(Order);
        o.setCost(cost);
        o.setDeliveryAddress(deliveryAddress);
        o.setStatus("New Order");
        orderList.add(o);
        id++;
    }
    
    public void addDish(Dish menu){      
        Menu.add(menu);
    }
  
    public void removeDish(Dish menu){      
        Menu.remove(menu);
    }

    public Object getQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAdminUName() {
        return adminUName;
    }

    public void setAdminUName(String adminUName) {
        this.adminUName = adminUName;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    public ArrayList<Dish> getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList<Dish> Menu) {
        this.Menu = Menu;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
