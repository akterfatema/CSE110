/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_04;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Fatema
 */
public class Lab08_04 {

    public static void main(String[] args) {
        try {
            List list1 = new List(5);
            List list2 = new List(5);
            List list3 = new List(5);
            List list4 = new List(5);
            List list5 = new List(5);
            list1.push(1);
            list2.pop();
            list3.push(3);
            list4.pop();
            list5.display();
            ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("tmp.dat"));
            object.writeObject(list1);
            object.writeObject(list2);
            object.writeObject(list3);
            object.writeObject(list4);
            object.writeObject(list5);
            object.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
