package org.bankproject;
/**
 * Class which represents an association between classes, with main method
 * @author jesus
 *
 */
class Association  
{ 
    public static void main (String[] args)  
    { 
        Bank bank = new Bank("Axis"); 
        Employee emp = new Employee("Neha"); 
          
        System.out.println(emp.getEmployeeName() +  
               " is employee of " + bank.getBankName()); 
    } 
} 