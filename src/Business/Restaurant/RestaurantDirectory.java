/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;
    private Restaurant restaurant;
    private Dish menu;
    
    public RestaurantDirectory(){
        this.restaurantList=new ArrayList<Restaurant>();
    }
    
    public Restaurant createRestaurantInfo(String uName){
        restaurant= new Restaurant(uName);
        restaurantList.add(restaurant);
        return restaurant;
    }
    
    public void deleteRestaurent(String username){
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getAdminUName().equals(username)){
                restaurantList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(Restaurant restro,String name,String number,String address){
        restro.setName(name);
        restro.setAddress(address);
        restro.setNumber(number);
    }
    
    public Dish AddMenuDish(Restaurant restro,String name,String desc,String amount){
        menu=new Dish(name, desc, amount);
        restro.addDish(menu);
        return menu;
    }
    
    public void DeleteDish(Restaurant restro,Dish menu){
        restro.removeDish(menu);   
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Dish getMenu() {
        return menu;
    }

    public void setMenu(Dish menu) {
        this.menu = menu;
    }
    
    
}
