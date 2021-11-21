/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String name, String username, String password, Employee employee, Role role){
        UserAccount ua = new UserAccount();
        ua.setName(name);
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(role);
        userAccountList.add(ua);
        return ua;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount createUserAccount(String username, String password,String contact, String address, Employee employee, Role role) {
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(role);
        userAccountList.add(ua);
        return ua;
    }
    
    public void updateUserAccount(UserAccount ua,String name,String username, String password){
       
        ua.setName(name);
        ua.setUsername(username);
        ua.setPassword(password);
    }
    
    public void removeAllAccounts() {
        for (int i = 0; i < userAccountList.size(); i++) {
            if (!userAccountList.get(i).getUsername().equalsIgnoreCase("admin")) {
                userAccountList.remove(i);
            }
        }
        for (int i = 0; i < userAccountList.size(); i++) {
            System.out.println(userAccountList.get(i).getEmployee());
        }
    }
    
    public void deleteUserAccount(UserAccount ua){
        userAccountList.remove(ua);
    }
    
    
}
