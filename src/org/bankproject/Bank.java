package org.bankproject;
/**
 * Bank class 
 * @author jesus
 *
 */
public class Bank  
{ 
    private String name; 
      
    /**
     * Constructor of Bank class
     * @param name Name of the Bank
     */
    public Bank(String name) 
    { 
        this.name = name; 
    } 
      
    /**
     * Get Bank name
     * @return Name of the Bank
     */
    public String getBankName() 
    { 
        return this.name; 
    } 
}  