/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_lab2_p4;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P_lab2_p4 {

    public static void main(String[] args) {
     Scanner af = new Scanner (System.in);  
        int [] Array_1 = new int [10]; 
        int [] distinct_Array = new int [10]; 
       int count = 0; 

        
        System.out.print("Enter ten numbers : ");

        for (int i = 0; i < Array_1.length; i++)
        {
             Array_1[i]= af.nextInt(); 
             
        }
        
 int[] distinct_Array_2 = Isdistinct(Array_1,distinct_Array);
        System.out.print("Distict numbers are: ");
        for (int i=0; i<distinct_Array_2.length; i++)
        {
            if (distinct_Array_2[i] != 0) 
            {
                System.out.print(distinct_Array_2[i]+" ");
            }
        }
    
        
    }
        public static int [] Isdistinct(int [] Array_1, int [] distinct_Array){
            int count=0;
            for (int i = 0; i < Array_1.length; i++)
        {
            boolean found = false;
            for (int j = 0; j < count; j++)
            {
                if (Array_1[i] == distinct_Array[j])
                {
                    found = true;
                    break;
                }
            }
            if (found==false)
            {
                distinct_Array[count++] = Array_1[i];
            }
        }
           System.out.println("The number of distinct numbers is " + count); 
           return distinct_Array;
        }
        
}
    
    

