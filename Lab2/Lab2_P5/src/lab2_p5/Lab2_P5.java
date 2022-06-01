/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_p5;
import java.util.Random;
/**
 *
 * @author Fatema
 */
public class Lab2_P5 {
    public static int minimum(int[] array){
        int min=array[0];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
                index=i;
            }
            
        }
        System.out.println("Index for min : "+ index);
        return min;
    }
    
    public static int maximum(int[] array){
        int max= array[0]; 
    int index=0;
    for(int i=1;i < array.length;i++){ 
      if(array[i] > max){ 
         max = array[i];
         index=i;
      } 
       
    } 
        System.out.println("Index for max : " + index);
        
         return max;
    }
   
    public static void main(String[] args) {
        
 Random rand=new Random();
 int[]array=new int[10];
 
        for (int i = 0; i < array.length; i++) {
            array[i]=rand.nextInt(100);
            System.out.println(array[i]);
        }
        int a=maximum(array);
        int b=minimum(array);
    System.out.println("max is = "+a); 
        System.out.println("min is = "+b);
  }
 
         
  }
 


