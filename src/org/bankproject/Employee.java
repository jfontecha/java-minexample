package org.bankproject;
/**
 * Class Employee
 * @author jesus
 *
 */
public class Employee 
{ 
    private String name; 
      
    /**
     * Constructor of Employee class 
     * @param name Employee name
     */
    public Employee(String name)  
    { 
        this.name = name; 
    } 
      
    /**
     * Get the Employee name
     * @return Employee name
     */
    public String getEmployeeName() 
    { 
        return this.name; 
    }  
} 