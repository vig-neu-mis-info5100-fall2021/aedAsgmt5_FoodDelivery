/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Vignesh Gunasekaran <gunasekaran.v@northeastern.edu>
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }
    
    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    } 
    
}
