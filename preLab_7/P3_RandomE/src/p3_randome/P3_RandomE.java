/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_randome;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P3_RandomE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        Random r = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        try {
            System.out.print("Enter the index number: ");
            int index = af.nextInt();
            if (index>99) {
               throw new ArrayIndexOutOfBoundsException();
            }
            else{
                System.out.println("Element value : "+array[index]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
