/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Ong Kai Feng
 */
public class overloading_1 {
        
    public static void main(String[] args){
        Loan loan = new Loan();
        
        //With the same method called, but pass in different type of parameter list
        loan.loan("Lily", 2000.00, "12 Dec");
        loan.loan("May", 3000.00);
    }
}

class Loan{
    
    public static void loan(String name, double amount, String date){
        System.out.println("Customer Name:" + name +
                           " Amount:" + amount +
                           " Date to Return:" + date);
    }
    
    public static void loan(String name, double amount){
            System.out.println("Customer Name:" + name +
                               " Aount:" +  amount + " Please list the date");
    }
}