/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_p2;
import java.util.Scanner;
/**
 *
 * @author Fatema
 */
public class Lab2_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner af = new Scanner(System.in);

        int[] array = new int[100];
        int n;
        System.out.print("Enter the integers between 1 and 100 : ");
           for (int i = 0; i < array.length; i++) {
            n=af.nextInt();
            array[i]=n;          
            if(n==0){
                break;
            }
        }

        cas(array);
    }

    public static void cas(int[] array) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == i)
                    count++;
            }
            if (count>0)
               
                System.out.printf("%d occurs %d %s\n",i,count, count > 1 ? "times" : "time");
        } 
        
    }
    
}
