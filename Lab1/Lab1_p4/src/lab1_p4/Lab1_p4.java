/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_p4;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class Lab1_p4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int NUMBER1= input.nextInt();
        if(NUMBER1==0)
        {
                System.out.println("USD: ");
                double USD= input.nextDouble();
                double BDT=USD*84.77;
                System.out.println("BDT " +BDT +" TK"  );
                        }
    else if(NUMBER1==1){
                System.out.println("BDT: ");
                double BDT= input.nextDouble();
                double USD=BDT/84.77;
                System.out.println("USD "+ USD +" $");
                        }
    else{
            System.out.println("Invalid");
    }
    }
}
