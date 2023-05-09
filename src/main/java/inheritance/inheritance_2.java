/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Ong Kai Feng
 */
public class inheritance_2 {
    public static void main(String args[]){
        dog d = new dog();
        cat c = new cat();
        snake s = new snake();
        
        d.eat();
        d.voice();
        
        System.out.print("\n");
        
        c.eat();
        c.voice();
        
        System.out.print("\n");
        
        s.voice();
    }
}

class animal{
    void eat(){
        System.out.println("We are animal");
    }
}

class dog extends animal{
    void voice(){
        System.out.println("I am dog");
        System.out.println("I am barking");
    }
}

class cat extends animal{
    void voice(){
        System.out.println("I am cat");
        System.out.println("I am meowing");
        System.out.println("I like sleeping");
    }
}

class snake extends animal{
    void voice(){
        System.out.println("I am snake");
        System.out.println("I am hissing");
        System.out.println("I like chasing");
    }
}