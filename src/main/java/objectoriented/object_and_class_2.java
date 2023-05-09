/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

import java.util.Scanner;

/**
 *
 * @author Ong Kai Feng
 */

//Initialize through method
public class object_and_class_2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        student s1 = new student();
        student s2 = new student();
        
        s1.insertRecord("S1001", "Karan");
        s2.insertRecord("S2002", "Lily\n");
        
        s1.displayInformation();
        s2.displayInformation();
        
        System.out.println("Enter Student Details");
        System.out.print("Student ID:");
        String id = sc.nextLine();
        
        System.out.print("Student Name:");
        String name = sc.nextLine();
        
        student s3 = new student();
        s3.insertRecord(id, name);
        s3.displayInformation();
    }
    
    static class student{
        String id = null;
        String name = null;

        void insertRecord(String r, String n){
            id = r;
            name = n;
        }

        void displayInformation(){
            System.out.println(id + " " + name);
        }
    }    
}