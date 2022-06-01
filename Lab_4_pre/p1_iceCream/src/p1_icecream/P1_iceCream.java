/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_icecream;

import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P1_iceCream {
    //searchByCompany function & print
    public static void searchByCompany(ice_cream[]obj,String companyName) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getIcecreamCompany().equals(companyName)) {
              
                System.out.println(obj[i].getIcecreamType() +" "+ obj[i].getIcecreamCompany()+" "+obj[i].getIcecreamPrice());
            }
            
        }
       
    }

    public static void main(String[] args) {//main function
        //input
        Scanner af=new Scanner(System.in);
        ice_cream[] obj=new ice_cream[5];//array
        for (int i = 0; i < obj.length; i++) {
            String type=af.next();
            String company=af.next();
            double price=af.nextDouble();
           obj[i]=new ice_cream(type,company,price);
            
        }
        System.out.println("");
         for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i].toString());
            
        }
        
        //equals function
       boolean uq= obj[2].equals(obj[3].getIcecreamPrice());
        if (uq==true) {
            System.out.println("True,caller object and callee object are same");
        }
        else
        {
            System.out.println("false,caller object and callee object are not same");
        }
        
        
       //compareTo fuction 
      int comp=obj[2].compareTo(obj[4].getIcecreamPrice());
        if (comp==1) {
            System.out.println("1,price of caller object is higher"); 
        }
        else if (comp==0) {
            System.out.println("0,both prices are the same"); 
        }
        else{
            System.out.println("-1,price of callee object is higher");
        }
        
        //searchByCompany function
        System.out.println("Company name : ");
        String company_name=af.next();
        searchByCompany(obj,company_name);
    }
}    
    /*
input
con polar 50
malai igloo 15
cup polar 20
chocobar polar 25
shormalai polar 30
*/

