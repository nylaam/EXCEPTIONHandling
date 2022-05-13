/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab.exception.handling;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class arithmeticException {
    public static void main(String[] args) {
        //int a=100;
    //  System.out.println ("Enter the value for b");
        Scanner console = new Scanner (System.in);
    // int b = console.nextInt();
    
        System.out.println("Enter the value for c");
    //Exception Handling
        try{
    int c = console.nextInt ();
    int res=c/0;
    // 10/(b-c);
        System.out.println("The result is "+res);
    }
    catch (ArithmeticException exception_message){
            System.out.println("adalah "+exception_message);
    }
    }
}
    
