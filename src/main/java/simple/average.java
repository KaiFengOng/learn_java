/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple;

import java.util.Scanner;

/**
 *
 * @author Ong Kai Feng
 */
public class average {
    
    static int sumtotal = 0;
    static float average = (float) 0.0;
        
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the total num you want to get the average:");
        int totalnum = sc.nextInt();
        
        for (int i=1; i<=totalnum; i++)
        {
            System.out.print("Please enter the num for " + i + ":");
            int tempnum = sc.nextInt();
            sumtotal += tempnum;               
        }
        
        average = sumtotal / totalnum;
        System.out.println("Total num you entered is " + totalnum);
        System.out.println("The average is " + (float)average);  //casting double to string
    }
}