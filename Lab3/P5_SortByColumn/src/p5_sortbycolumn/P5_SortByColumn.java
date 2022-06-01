/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5_sortbycolumn;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fatema
 */
public class P5_SortByColumn {
    public static void sortByColumn(int matrix[][],int col) {
        for (int i = 0; i < matrix.length; i++) {
            int min_col=matrix[0][col];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][col]<min_col) {
                    matrix[i][j]=matrix[i][col];
                  min_col=matrix[i][col];
                  System.out.print(matrix[i][col] + " ");
                }      
            }
        }
        /*for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }*/
  
    }
    
    public static void main(String[] args) {
        Scanner af= new Scanner(System.in);
       Random rand=new Random();
       int[][] matrix =new int[4][4];
        for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(100);
                                System.out.print(matrix[i][j]+ " ");
			}
                        System.out.println(" ");
		}
        System.out.println("Enter Column number : ");
        int col=af.nextInt();
        sortByColumn(matrix,col);
    }
    
}
