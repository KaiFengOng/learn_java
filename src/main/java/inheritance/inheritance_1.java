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
public class inheritance_1 {
    public static void main(String[] args){
        Programmer p = new Programmer(); //create an object
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Programmer salary is:" + p.bonus);
    }
}

class Employee{
    int salary = 4000;
}

class Programmer extends Employee{
    int bonus = 1000;
}
