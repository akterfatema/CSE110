/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_geometric;

/**
 *
 * @author Fatema
 */
public class Triangle extends GeometricObject{
     private double side1=1;
    private double side2=1;
    private double side3=1;
//default constractor
    public Triangle() {
    }
//constructor&specified
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    //AreaMethod
   public double getArea(){
    double s =(side1+side2+side3)/2;
    double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    return area;
}         
 // getPerimeter
   public double getPerimeter(){
       return side1+side2+side3;
   }

  
    public String toString() {
        return "Triangle: side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 ;
    }
   
}
