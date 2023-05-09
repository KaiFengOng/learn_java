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
public class this_keyword {
    public static void main(String args[]){
        Student s1 = new Student(111, "Lily", 5000f);
        Student s2 = new Student(222, "May", 6000f);
        
        s1.display();
        System.out.println("\n");
        s2.display();
    }
}

class Student{
    int rollno;
    String name;
    float fee;
    
  
    Student(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    
    void display(){
        System.out.print(rollno + " " + name + " " + fee);
    }
}