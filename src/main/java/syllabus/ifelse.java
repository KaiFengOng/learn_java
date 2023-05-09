/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syllabus;

import java.util.Scanner;


/**
 *
 * @author Ong Kai Feng
 */
public class ifelse {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Please enter the total amout you want to borrow:");
        int amount = sc.nextInt();
        
        if(amount < 10000){
            System.out.println("Your are eligible to borrow");
        }
        else{
            System.out.println("Your are not eligible to borrow");
        }    
    }    
}
