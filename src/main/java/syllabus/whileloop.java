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
public class whileloop {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total time you want to loop:");
        int times = sc.nextInt();
        
        int i =0;
        int total = 0;
        
        while(i<times){
            System.out.print("Enter the num:");
            int num = sc.nextInt();
            total += num;  
                i++;
        }
        
        System.out.print("The total of sum is:" + total);
    }   
}
