/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ong Kai Feng
 */
public class aggregation_1 {
   //if a class have an entity reference, it is know as aggregation. Aggregation represents HAS-A relationship
   public static void main(String[] args){
       Bank bank = new Bank("ICIC");
       Employee emp = new Employee("Jimmy");
       
       Set<Employee> employees = new HashSet<>();
       employees.add(emp);
       
       bank.setEmployees(employees);
       
       System.out.println(emp.getEmployeeName()
                            + " belongs to bank " 
                            + bank.getBankName());
   }
}

class Bank{
    private final String name;
    private Set<Employee> employees;
    
    Bank(String name){
        this.name = name;
    }
    
    public String getBankName(){
        return this.name;
    }
    
    public void setEmployees(Set<Employee> employees){
        this.employees = employees;
    }
    
    public Set<Employee>getEmployees(Set<Employee> employees){
        return this.employees;
    }
}

class Employee{
    private final String name;
    Employee(String name){
        this.name = name;
    }
    
    public String getEmployeeName(){
        return this.name;
    }
}