/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package super_project;

/**
 *
 * @author Ong Kai Feng
 */
public class super_project_1 {
    public static void main(String[] args){
        dog dog1 = new dog();
        dog1.printColor();
    }
}

class animal{
    String color = "white";
}

class dog extends animal{
    String color = "dark";
    
    void printColor(){
        System.out.println("This dog is " + color + " color");
        
        // super use to call parent class
        System.out.println("This dog is " + super.color + " color");
    }
}