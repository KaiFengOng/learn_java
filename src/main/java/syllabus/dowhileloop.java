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
public class dowhileloop {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many you want to add:");
        int times = sc.nextInt();
        
        int i=0;
        int total=0;
        
        do{
            System.out.print("Enter num" + i + ":");
            int num = sc.nextInt();
            total += num;
            
            i++;
        }while(i<times);
        
        System.out.print("The sum of " + times + " is " + total);
    }
}
