/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_learn;

/**
 *
 * @author Ong Kai Feng
 * 14 April 2023
 */


//Interface is a blueprint of a class. It thas static constants and abstract methods
//Is a mechanism to achieve abstraction. There can be only abstract methods in Java interface. 
public class interface_learn_1 {
    public static void main(String[] args){
        A6 obj = new A6();
        obj.print();
        obj.testprint();
    }
}

interface printable{
    void print();
    void testprint();
}

class A6 implements printable{
    @Override
    public void print(){
        System.out.println("Hello");
        System.out.println("I am here to test project");
    }
    
    @Override
    public void testprint(){
        System.out.println("Test test test");
    }
}