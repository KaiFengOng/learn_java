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
public class overriding_2 {
    public static void main(String[] args){
        item item1 = new item();
        item1.face();
        
        item item2 = new mask();
        item2.face();
        
        item item3 = new mouth();
        item3.face();
    }
}

class item{
    void face(){
        System.out.println("Face");
    }
}

class mask extends item{
    @Override
    void face(){
        System.out.println("Whitening and Smooth");
    }
}

class mouth extends item{
    @Override
    void face(){
        System.out.println("Lips Carring");
    }
}