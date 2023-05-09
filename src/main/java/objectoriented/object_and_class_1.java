/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

/**
 *
 * @author Ong Kai Feng
 */
public class object_and_class_1 {
    
    public static void main(String args[]){
        student s1 = new student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        
        student s2 = new student();
        s2.id = "S2001";
        s2.name = "KaiFeng";
        
        System.out.println("Your student id is " + s2.id);
        System.out.println("Your student name is " + s2.name);
    }
}

class student{
    String id;
    String name;
}