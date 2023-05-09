/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Ong Kai Feng
 */

public class overriding_1 {
    public static void main(String[] args){
        Parent obj1 = new Parent();
        obj1.show();
        
        Parent obj2 = new Child();
        obj2.show();
    }
}

class Parent{
    void show(){
        System.out.println("Parent's Show");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child's Show");
    }
}