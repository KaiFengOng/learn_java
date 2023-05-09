/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.Scanner;

/**
 *
 * @author Ong Kai Feng
 */
public class overloading_2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Select Which 1 you want to enter\n");
        System.out.print("1. Name + Email + Phone No\n");
        System.out.print("2. Name + Email + Phone No + Address\n");
        int choice = sc.nextInt();
        sc.nextLine();
        
        if(choice == 1){
            System.out.print("Name + Email + Phone No\n");
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Phone No: ");
            String phoneNo = sc.nextLine();
            
            userDetails detail = new userDetails();
            detail.details(name, email, phoneNo);
        }
        
        else{
            System.out.println("Name + Email + Phone No + Address\n");
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Phone No: ");
            String phoneNo = sc.nextLine();
            
            System.out.print("Address:" );
            String address = sc.nextLine();
            
            userDetails detail = new userDetails();
            detail.details(name, email, phoneNo, address);
        }    
    }
}

class userDetails{
    
    public static void details(String name, String email, String phoneNum){
        System.out.println("Username: " + name + 
                           " Email: " + email +
                           " Phone No: " + phoneNum);
    }
    
    public static void details(String name, String email, String phoneNum, String address){
        System.out.println("Username: " + name + 
                           " Email: " + email + 
                           " Phone No: " + phoneNum + 
                           " Address: " + address);
    }
}