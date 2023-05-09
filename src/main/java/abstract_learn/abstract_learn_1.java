/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_learn;

/**
 *
 * @author Ong Kai Feng
 */
public class abstract_learn_1 {
    
    public static void main(String[] args){
        Bank b;     
        b = new SBI();
        System.out.println("Rate of Interest "  + b.getRateOfInterest() + "%");
        
        b =new PNB();
        System.out.println("Rate of Interest " + b.getRateOfInterest() + "%");
    }
}

abstract class Bank{
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    @Override
    int getRateOfInterest(){
        return 7;
    }
}

class PNB extends Bank{
    @Override
    int getRateOfInterest(){
        return 8;
    }
}
