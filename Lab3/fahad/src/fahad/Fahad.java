/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahad;

/**
 *
 * @author Fatema
 */
public class Fahad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int[][] hours = {{2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
        int[] sumOfRow = new int[hours.length];

        int sum;
        for (int i = 0; i < hours.length; i++) {
            sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            sumOfRow[i] = sum;
        }

        for (int i = 0; i < hours.length; i++) {
            int maximum = sumOfRow[0];
            int position = 0;
            for (int j = 0; j < hours.length; j++) {
                if (sumOfRow[j] > maximum) {
                    maximum = sumOfRow[j];
                    position = j;
                }
            }
            System.out.print("Employee" + position + ":");
            for (int k = 0; k < hours[position].length; k++) {
                System.out.print("  " + hours[position][k]);
            }
            System.out.println();
            sumOfRow[position] = 0;
        }
    }
    }
    

