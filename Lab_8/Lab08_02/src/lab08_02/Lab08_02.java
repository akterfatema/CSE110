/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

/**
 *
 * @author Fatema
 */
public class Lab08_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("Lab08_02.dat"));
            Random r = new Random();
            String space = " ";
            byte[] sp = space.getBytes();
            for (int i = 0; i < 100; i++) {
                int num = r.nextInt(50);
                output.write(num);
                output.write(sp);
            }
            output.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
