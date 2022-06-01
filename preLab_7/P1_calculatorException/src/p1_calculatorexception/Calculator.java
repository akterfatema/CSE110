/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_calculatorexception;

public class Calculator {

    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void Add() throws ArithmeticException{

        if (a < 0 || b < 0) {
            throw new ArithmeticException("Number can't be negative");
        }
        int sum = a + b;
        System.out.println("Sum of two number : " + sum);

    }

    public void Subtract() {

        if (a < 0 || b < 0) {
            throw new ArithmeticException();
        }
        int sub = a - b;
        System.out.println("Subtract of two numbers : " + sub);

    }

    public void multiply() {
        if (a == 0 || b == 0) {
            throw new ArithmeticException();
        }
        int mul = a * b;
        System.out.println("Multiply of two integer : " + mul);
    }

    public void division() {
        if (a == 0 || b == 0) {
            throw new ArithmeticException();
        }
        int div = a / b;
        System.out.println("Division of two integer : " + div);
    }
  
   
}
