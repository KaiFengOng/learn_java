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
public class forloop {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int total = 0;
        
        System.out.print("Enter the total times you want to add:");
        int loop1 = sc.nextInt();
        
        for(int i=0; i<loop1; i++){
            System.out.print("Enter num "+ i + ":");
            int num = sc.nextInt();
            total += num;           
        }
        
        System.out.print("The total of sum is: " + total);
    }
}