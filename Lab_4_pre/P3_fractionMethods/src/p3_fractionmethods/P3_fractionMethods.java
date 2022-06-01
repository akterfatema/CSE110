/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_fractionmethods;

import java.util.Scanner;

public class P3_fractionMethods {

    
    public static void main(String[] args) {
        Scanner af=new Scanner(System.in);
        //input
        int numerator1=af.nextInt();
        int denominator1=af.nextInt();
        Fraction frac1=new Fraction(numerator1, denominator1);
        int numerator2=af.nextInt();
        int denominator2=af.nextInt();
        Fraction frac2=new Fraction(numerator2, denominator2);
          //printtoString
        System.out.println("fraction1 is: "+frac1.toString());
        System.out.println("fraction2 is: "+frac2.toString());
        //print two fractional number
        System.out.println("Fraction number 1 is: "+ numerator1+"/"+denominator1);
        System.out.println("Fraction number 2 is: "+ numerator2+"/"+denominator2);
        frac1.add(frac2);
        frac1.sub(frac2);
        frac1.multiplication(frac2);
        frac1.division(frac2);
    }
    
}
