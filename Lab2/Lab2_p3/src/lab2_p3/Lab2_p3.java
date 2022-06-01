/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_p3;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class Lab2_p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner af=new Scanner(System.in);
        int n=af.nextInt();
        int m;
        int sum=0;
        int temporary=n;
        do{ 
            m=n%10;
            sum=(sum*10)+m;
            n=n/10;
        }
        while(n>0);
        if(temporary==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
