/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_learn;

import java.util.Scanner;

/**
 *
 * @author Ong Kai Feng
 * 17/4/2023
 */
public class abstract_project_1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the total quantity for Dragon Fruit:");
        int totalDragonFruit = sc.nextInt();
        fruit dragonfruit;
        dragonfruit = new dragonfruit();
        
        int priceDragonFruit = totalDragonFruit * dragonfruit.getPriceofFruit();
        
        System.out.print("Total you hae pick is " + totalDragonFruit + " and the Price of total is " + priceDragonFruit);  
    }
}

abstract class fruit{
    abstract int getPriceofFruit();
}

class dragonfruit extends fruit{
    @Override
    int getPriceofFruit(){
        return 19;
    }
}
