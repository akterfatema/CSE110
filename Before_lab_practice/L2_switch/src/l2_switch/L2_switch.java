
package l2_switch;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;


public class L2_switch {

    
    public static void main(String[] args) {
   
        
        int num1,num2,inp;
    Scanner input = new Scanner(System.in);
    
    num1 = input.nextInt();
     num2 = input.nextInt();
    inp=input.nextInt();
   // char charec= input.next().charAt(0);
    switch(inp)
            {
        case 1: int sum = num1+num2;
            System.out.println(sum);
            break;
        case 2: int div= num1/num2;
            System.out.println(div);
               break;
        case 3: int sub= num1-num2;
            System.out.println(sub);
            break;
        case 4: int mul= num1*num2;
            System.out.println(mul);
            break;
        default:
            System.out.println(" invalid Option");
            
    }
    
    }   
}
    

