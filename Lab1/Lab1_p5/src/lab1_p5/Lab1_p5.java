/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_p5;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class Lab1_p5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the center");
        double p= input.nextDouble();
        double q= input.nextDouble();
        double radius=input.nextDouble();
        double x= input.nextDouble();
        double y= input.nextDouble();
        double check_distance=Math.pow(Math.pow((p-x), 2)+Math.pow((q-y), 2),0.5);
        if(check_distance<radius){
            System.out.println("ïnside the circle");   
        }
        else if(check_distance>radius){
            System.out.println("outside the circle");   
        }
        else{
            System.out.println("On the circle");
        }
        // TODO code application logic here
    }
    
}
