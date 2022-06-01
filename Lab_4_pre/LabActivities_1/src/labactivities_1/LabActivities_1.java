/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivities_1;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class LabActivities_1 {

    public static void main(String[] args) {
       Scanner af=new Scanner(System.in);
       String type1=af.next();
       String company1=af.next();
       double price1=af.nextDouble();
       IcecreamLab1 iceC_1=new IcecreamLab1();
       iceC_1.setIcecreamType(type1);
       iceC_1.setIcecreamCompany(company1);
       iceC_1.setIcecreamPrice(price1);
       
       String type2=af.next();
       String company2=af.next();
       double price2=af.nextDouble();
       IcecreamLab1 iceC_2=new IcecreamLab1();
       iceC_2.setIcecreamType(type2);
       iceC_2.setIcecreamCompany(company2);
       iceC_2.setIcecreamPrice(price2);
       
        System.out.println(iceC_1.toString());
        System.out.println(iceC_2.toString());
        
        if (iceC_1.equals(iceC_2)) {
            System.out.println("True");
            
                            }
        
        else {
            System.out.println("False");
        }
          int co=iceC_1.compareTo(iceC_2);
        if (co==1) {
            System.out.println("1"); 
        }
        else if (co==0) {
            System.out.println("0"); 
        }
        else{
            System.out.println("-1");
        }   
    }  
}
