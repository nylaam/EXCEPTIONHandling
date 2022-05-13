/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab.exception.handling;

/**
 *
 * @author WINDOWS 10
 */
public class keywordThrows {
    public static void test(int n)
           throws NullPointerException, ArithmeticException{
        if(n<0){
            throw new NullPointerException(
                    "KESALAHAN: arithmetic exception");
        }else {
            throw new ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
    } 
    public static void main(String[]args){
        try{
            test(-12);
            //menimbulkan eksepsi NullPointerException
            //test(0); 
            //menimbulkan esksepsi ArithmeticException
        } catch (ArithmeticException|NullPointerException e)
        {
            System.out.println("Eksepsi ditangkap disini");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
