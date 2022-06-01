/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_calculatorexception;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P1_calculatorException {

    public static void main(String[] args) {

//forAdd
        boolean f = true;
        do {
            try {
                Scanner af = new Scanner(System.in);
                System.out.print("Enter two integer for add : ");
                double p = af.nextDouble();
                double q = af.nextDouble();
                int i = (int) p, j = (int) q;
                if (i == p && j == q) {
                    Calculator obj1 = new Calculator(i, j);
                    obj1.Add();
                    f = false;
                } else {
                    throw new NumberFormatException();
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } while (f == true);
        System.out.println("");
//forSub
        boolean t = true;
        do {
            try {
                Scanner af = new Scanner(System.in);
                System.out.print("Enter two integer for subtract: ");
                double p = af.nextDouble();
                double q = af.nextDouble();
                int i = (int) p, j = (int) q;
                if (i == p && j == q) {
                    Calculator obj2 = new Calculator(i, j);
                    obj2.Subtract();
                    t = false;
                } else {
                    throw new NumberFormatException();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (t == true);
        System.out.println("");
//forMul
        boolean a = true;
        do {
            try {
                Scanner af = new Scanner(System.in);
                System.out.print("Enter two integer for multiply : ");
                double p = af.nextDouble();
                double q = af.nextDouble();
                int i = (int) p, j = (int) q;
                if (i == p && j == q) {
                    Calculator obj3 = new Calculator(i, j);
                    obj3.multiply();
                    a = false;
                } else {
                    throw new NumberFormatException();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (a == true);
        System.out.println("");
//forDiv
        boolean b = true;
        do {
            try {
                Scanner af = new Scanner(System.in);
                System.out.print("Enter two integer for division: ");
                double p = af.nextDouble();
                double q = af.nextDouble();
                int i = (int) p, j = (int) q;
                if (i == p && j == q) {
                    Calculator cal2 = new Calculator(i, j);
                    cal2.division();
                    b = false;
                } else {
                    throw new NumberFormatException();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (b == true);
    }

}
