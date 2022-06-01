/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_03;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class Lab08_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner af = new Scanner(new File("E:\\Spring_2021\\CSE110\\write.txt"));
            DataOutputStream data= new DataOutputStream(new FileOutputStream("temp.dat"));
            
            while (af.hasNext()) {
                String name = af.next();
                data.writeUTF(name);
                      
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
