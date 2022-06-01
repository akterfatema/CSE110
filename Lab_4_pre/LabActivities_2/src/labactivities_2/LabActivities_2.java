/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivities_2;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class LabActivities_2 {

   
    public static void main(String[] args) {
         Scanner af=new Scanner(System.in);
        IcecreamLabActivities2[] icecreamArray=new IcecreamLabActivities2[10];//array
        for (int i = 0; i < icecreamArray.length; i++) {
            String type=af.next();
            String company=af.next();
            double price=af.nextDouble();
           icecreamArray[i]=new IcecreamLabActivities2(type,company,price);
            
        }
        System.out.println(""); 
        
        for (int i = 0; i < icecreamArray.length; i++) {
            System.out.println(icecreamArray[i].toString());
            
        }
       
        
        //equals function
       boolean uq= icecreamArray[2].equals(icecreamArray[3]);
        if (uq==true) {
            System.out.println("True,caller object and callee object are same");
        }
        else
        {
            System.out.println("False,caller object and callee object are not same");
        }
        
        
       //compareTo fuction 
      int comp=icecreamArray[0].compareTo(icecreamArray[8]);
        if (comp==1) {
            System.out.println("1,price of caller object is higher"); 
        }
        else if (comp==0) {
            System.out.println("0,both prices are the same"); 
        }
        else{
            System.out.println("-1, price of callee object is higher");
        }
        
    }
    
}
/*
con polar 50
malai igloo 15
cup polar 20
chocobar polar 25
shormalai polar 30
con igloo 45
malai polar 14
shormalai igloo 25
chocobar igloo 23
cup igloo 22
*/