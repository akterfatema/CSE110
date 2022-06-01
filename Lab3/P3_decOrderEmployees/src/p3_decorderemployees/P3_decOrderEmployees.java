/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3_decorderemployees;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P3_decOrderEmployees {
    public static int [] sum(int [][]matrix,int []sum_arr) {
       
        for (int i = 0; i < matrix.length; i++) {
          int   sum =0;
            for (int j = 0; j < matrix.length; j++) {
               sum+=matrix[i][j];
                
            }
            sum_arr[i]=sum;
        }
        return sum_arr;
    }
    
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner af=new Scanner(System.in);
         int E_num=af.nextInt();
        
       
       int[][] matrix =new int[E_num][7];
        for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(8);
                                System.out.print(matrix[i][j]+ " ");
			}
                        System.out.println(" ");
		}
        int[] sum_array=new int[matrix.length];
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            sum_array[i] = sum;
        }
         System.out.println("In decreasing order : ");
          for (int i = 0; i < matrix.length; i++) {
            int maximum =sum_array[0];
            int index = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (sum_array[j] > maximum) {
                    maximum = sum_array[j];
                    index = j;
                }
            }
            
            System.out.print("Employee number " + index + " : ");
            for (int m = 0; m < matrix[index].length; m++) {
                System.out.print("  " + matrix[index][m]);
            }
            System.out.println();
            sum_array[index] = 0;
        }
        
    }
    }
    

