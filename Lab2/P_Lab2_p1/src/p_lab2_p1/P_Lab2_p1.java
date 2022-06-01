/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_lab2_p1;
import java.util.Scanner;
/**
 *
 * @author Fatema
 */
public class P_Lab2_p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner af=new Scanner(System.in);
        System.out.println("Students Number : ");
        int size=af.nextInt();
        int[] array= new int[size];
        System.out.println("Enter scores : ");
        for (int i = 0; i < array.length; i++) {
          array[i]=af.nextInt();
            
        }
        int best=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=best) {
                best=array[i];   
            }
            }
            System.out.println("Best = "+best);
            for (int i = 0; i < array.length; i++) {
                if (array[i]>=(best-10)) {
                    System.out.println("Student "+i+" score is "+ array[i]+ " and grade is "+ "A");
                }
                else if (array[i]>=(best-20)) {
                    System.out.println("Student "+i+" score is "+ array[i]+ " and grade is "+ "B");
                }
                else if (array[i]>=(best-30)) {
                    System.out.println("Student "+i+" score is "+ array[i]+ " and grade is "+ "C");
                }
               else if (array[i]>=(best-40)) {
                    System.out.println("Student "+i+" score is "+ array[i]+ " and grade is "+ "D");
                }
                 else{
                System.out.println("Grade is F");
        }
                  
            } 
    }
    
}
