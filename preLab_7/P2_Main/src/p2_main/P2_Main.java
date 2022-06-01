/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_main;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            Scanner af = new Scanner(System.in);
            Product product = new Product();
            System.out.print("Enter the weight of product: ");
            int a = af.nextInt();
            product.productCheck(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
