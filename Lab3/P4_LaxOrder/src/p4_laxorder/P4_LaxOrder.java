/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_laxorder;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P4_LaxOrder {

    public static void main(String[] args) {
        Scanner af=new Scanner(System.in);
        System.out.println("Enter string number : ");
        int number=af.nextInt();
        System.out.println("String : ");
        String[] s=new String[number];
        for (int i = 0; i <number; i++) {
           s[i]=af.next();
            
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
             if(s[i].compareTo(s[j])>0){   
                String temp=s[i];
                s[i]=s[j];
             s[j]=temp;
            }
            } 
        }
        
        System.out.println("in Lexicographical Order : ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            
        }
    }
    
}
