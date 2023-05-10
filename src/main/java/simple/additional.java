/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Scanner;

/**
 * @author Ong Kai Feng
 */

public class additional {
    
    static int sumtotal = 0;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter 1st number:");
        int num1 = sc.nextInt();
        
        System.out.print("Please enter 2nd number:");
        int num2 = sc.nextInt();
        
        int ans = num1 + num2;
        
        System.out.println("The Sum of the 2 number you entered is " + ans + "\n");
        
        
        System.out.print("Please enter total num you want to add:");
        int totalnum = sc.nextInt();
        
        
        for (int i = 1; i <= totalnum; i++)
        {
            System.out.print("Please enter the num for " + i + ":");
            int tempnum = sc.nextInt();    
            sumtotal += tempnum;
        }
        
        System.out.println("Total Num you entered is "+ totalnum);
        System.out.println("The Sum of it is " + sumtotal);
    }
}