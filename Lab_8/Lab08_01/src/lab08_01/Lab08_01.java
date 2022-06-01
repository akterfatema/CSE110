/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_01;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Fatema
 */
public class Lab08_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File file = new File("Lab08_01.txt");
            PrintWriter write = new PrintWriter(file);
            Random r = new Random();
            for (int i = 0; i < 100; i++) {
                int num = r.nextInt(50);
                write.write(num + " ");
               
            }
            write.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
