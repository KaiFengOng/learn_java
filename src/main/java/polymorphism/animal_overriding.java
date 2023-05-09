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
public class animal_overriding {
    
    public static void main(String[] args){
        animal animal1 = new animal();
        animal1.noise();
        
        animal dog = new dog();
        dog.noise();
        
        animal cat = new cat();
        cat.noise();
    }
}

class animal{
    void noise(){
        System.out.println("We make noise");
    }
}

class cat extends animal{
    @Override
    void noise(){
        System.out.println("I am cat meow");
    }
}

class dog extends animal{
    @Override
    void noise(){
        System.out.println("I am dog bark");
    }
}