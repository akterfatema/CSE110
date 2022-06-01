/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_geometric;

import java.util.Scanner;

class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String msg) {
        super(msg);
    }

}

public class P4_GeoMetric {

    public static void main(String[] args) {
        try {
            Scanner af = new Scanner(System.in);
            System.out.print("Enter three side of the triangle: ");
            double side1 = af.nextDouble();
            double side2 = af.nextDouble();
            double side3 = af.nextDouble();
            if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
                System.out.print("Color: ");
                String color = af.next();
                System.out.print("Filled: ");
                boolean filled = af.nextBoolean();
                Triangle t = new Triangle(side1, side2, side3);
                t.setColor(color);
                t.setFilled(filled);
                System.out.println("Area: " + t.getArea());
                System.out.println("Perimeter: " + t.getPerimeter());
                System.out.println(t.toString());
                System.out.println("Color: " + t.getColor());
                if (filled == true) {
                    System.out.println(filled+", Triangle is filled ");
                } else {
                    System.out.println(filled+", Triangle is not filled ");
                }

            } else {
                throw new IllegalTriangleException("the sum of any two sides must be greater than the other side.So, it Violated the rule");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
