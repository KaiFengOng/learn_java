/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_learn;

import java.util.Scanner;

/**
 *
 * @author Ong Kai Feng
 */
public class interface_calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter 2 no:");
        System.out.print("Num1:");
        int num1 = sc.nextInt();
        
        System.out.print("Num2:");
        int num2 = sc.nextInt();
        
        calculate equation1 = new calculate();
        equation1.caladd(num1,num2);
        equation1.calsub(num1,num2);
        equation1.calmul(num1, num2);
        equation1.caldiv(num1, num2);
        equation1.calpower(num1, num2);
    }
}

interface calculation{
    void caladd(int x, int y);
    void calsub(int x, int y);
    void calmul(int x, int y);
    void caldiv(int x, int y);
    void calpower(int x, int y);
}

class calculate implements calculation{
    @Override
    public void caladd(int x, int y){
        System.out.println("This is add function");
        int total = x + y;
        System.out.println("Add of these 2 num is " + total);
    }
    
    @Override
    public void calsub(int x, int y){
        System.out.println("This is subtract function");
        int total = x - y;
        System.out.println("Subtract of these 2 num is " + total);
    }
    
    @Override
    public void calmul(int x, int y){
        System.out.println("This is multiply function");
        int total = x * y;
        System.out.println("Multiplication of these 2 num is " + total);
    }
    
    @Override
    public void caldiv(int x, int y){
        System.out.println("This is divition function");
        int total = x / y;
        System.out.println("Divition of these 2 num is " + total);
    }
    
    @Override
    public void calpower(int x, int y){
        System.out.println("This is power function");
        int total = (int)Math.pow(x,y);//Type cast to integer
        System.out.println("Result of the power is " + total);
    }
}