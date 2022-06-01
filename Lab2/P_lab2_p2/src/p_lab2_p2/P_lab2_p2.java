/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_lab2_p2;
import java.util.Random;
/**
 *
 * @author Fatema
 */
public class P_lab2_p2 {

    
    public static void main(String[] args) {
       Random rand = new Random();
        int[][] matrix = new int[4][4];
 
                for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(2);
                                System.out.print(matrix[i][j]);
			}
                        System.out.println(" ");
		}

            int maximum_row = 0;
            int max_row_index = 0;
            for (int i = 0; i < matrix.length; i++) {
            int count = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j]==1) {
                        count++;
                    }
                }
                if (count>maximum_row) {
                    maximum_row = count;
                    max_row_index = i;
                }
        }
     
int max_col = 0;
            int max_col_index = 0;
            for (int j = 0; j < matrix.length; j++) {
            int count = 0;
                for (int i = 0; i < matrix[j].length; i++) {
                    if (matrix[i][j]==1) {
                        count++;
                    }
                }
                if (count>max_col) {
                    max_col = count;
                    max_col_index = j;
                }
        }
            System.out.println(max_col_index);
       
    }
    
}
