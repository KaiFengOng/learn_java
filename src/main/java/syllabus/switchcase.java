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
public class switchcase {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Select which Part you want to go");
        System.out.println("Part 1");
        System.out.println("Part 2");
        System.out.println("Part 3 ");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();    
        
        switch(choice){
            case 1:
                System.out.println("Part 1");
                break;
            case 2:
                System.out.println("Part 2");
                break;
            case 3:
                System.out.println("Part 3");
                break;
            
            default:System.out.println("Out of Bound");
        }
    }  
}
