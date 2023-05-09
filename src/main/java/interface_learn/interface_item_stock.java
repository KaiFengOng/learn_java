/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_learn;

import java.util.Scanner;

/**
 *
 * @author Ong Kai Feng
 */
public class interface_item_stock {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Welcome to fruit stall");
        System.out.println("Choose which fruit you want to buy");
        System.out.println("1.Apple");
        System.out.println("2.Pear");
        System.out.println("3.Orange");
        System.out.println("4.Lemon");
        System.out.println("Select which fruit you want to buy");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.print("You have select apple, enter how much you want to buy:");
                int quantityapple = sc.nextInt();
                
                fruit newfruitapple = new pricefruit();
                newfruitapple.apple(quantityapple);
                break;
            case 2:
                System.out.print("You have select pear, enter how much you want to buy:");
                int quantitypear = sc.nextInt();
                
                fruit newfruitpear = new pricefruit();
                newfruitpear.pear(quantitypear);
                break;
            case 3:
                System.out.print("You have select Orange, enter how much you want to buy:");
                int quantityorange = sc.nextInt();
                
                fruit newfruitorange = new pricefruit();
                newfruitorange.orange(quantityorange);
                break;
            case 4:
                System.out.print("You have select Lemon, enter how much you want to buy:");
                int quantitylemon = sc.nextInt();
                
                fruit newfruitlemon = new pricefruit();
                newfruitlemon.lemon(quantitylemon);
        }
    }
}

interface fruit{
    void apple(int quantity);
    void pear(int quantity);
    void orange(int quantity);
    void lemon(int quantity);
}

class pricefruit implements fruit{
    @Override
    public void apple(int quantity){
        System.out.println("Apple price for each 1 is $9");
        System.out.println("Total you have take is " + quantity);
        System.out.println("Total price is " + quantity * 9);
    }
    
    @Override
    public void pear(int quantity){
        System.out.println("Pear price for each 1 is $8");
        System.out.println("Total you have take is " + quantity);
        System.out.println("Total price is " + quantity * 8);
    }
    
    @Override
    public void orange(int quantity){
        System.out.println("Oragne price for each 1 is $8.5");
        System.out.println("Total you have take is " + quantity);
        System.out.println("Total price is " + quantity * 8.5);
    }
    
    @Override
    public void lemon(int quantity){
        System.out.println("Lemon price for each 1 is $10");
        System.out.println("Total you have take is " + quantity);
        System.out.println("Total price is " + quantity * 10);
    }
}