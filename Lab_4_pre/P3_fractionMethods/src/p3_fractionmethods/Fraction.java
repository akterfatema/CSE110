/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_fractionmethods;

/**
 *
 * @author Fatema
 */
public class Fraction {
    //objrct
   private int numerator;
   private int denominator;
//constractor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
//get&set
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    //toString method
   public String toString(){
   String fraction=numerator+"/"+denominator;
      return fraction;
   }
   //add method
    public void add(Fraction frac2){
      int multi=denominator*frac2.denominator;
     int ad=((multi/denominator)*numerator)+((multi/frac2.denominator)*frac2.numerator);  
        System.out.println("Add is: "+ad+"/"+multi);
    }
//submethod
    public void sub(Fraction frac2){
     int multi=denominator*frac2.denominator;
     int s=((multi/denominator)*numerator)-((multi/frac2.denominator)*frac2.numerator);  
        System.out.println("Sub is: "+s+"/"+multi);
    }
    //multiplicationMethod
    public void multiplication(Fraction frac2){
      System.out.println("Multiplication is: "+(numerator*frac2.numerator)+"/"+(denominator*frac2.denominator));
    }
    //divisionMethod
    public void division(Fraction frac2){
      System.out.println("Division is: "+(numerator*frac2.denominator)+"/"+(frac2.numerator*denominator));
    }
}
        