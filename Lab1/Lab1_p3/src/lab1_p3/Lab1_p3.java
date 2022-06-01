
package lab1_p3;

import java.util.Scanner;


public class Lab1_p3 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a= input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double discriminant= b*b-4*a*c; 
        if(discriminant>0){
            System.out.println("The equation has two real roots");
            double r1= (-b+Math.sqrt(discriminant))/2*a;
            System.out.println("root1= "+r1);
            double r2= (-b-Math.sqrt(discriminant))/2*a;
            System.out.println("root2= "+r2);
            }
        else if(discriminant==0){
         System.out.println("The equation has one real roots");
          double r1= (-b+Math.sqrt(discriminant))/2*a;
            System.out.println("root1= "+r1);
    }
        else{
             System.out.println("The equation has no real roots");
        }
        
        
        
      
        
       
    }
    
}
