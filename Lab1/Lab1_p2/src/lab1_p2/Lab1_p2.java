/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_p2;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class Lab1_p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1;
        System.out.println("Enter the number of minutes: ");
        int min= input.nextInt();
        int days= min/(60*24);
        int Years = days/365;
        int Final_days = days%365;
        
        System.out.printf("%d Years and %d days ",Years,Final_days );
       
    }
    
}
