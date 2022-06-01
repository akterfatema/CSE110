/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6_sort;
import java.util.Scanner;
/**
 *
 * @author Fatema
 */
public class P6_sort {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
		System.out.print("Number of students: ");
                
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];
		System.out.println("Enter every student name and score : ");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}
		sorting(students, scores);
		for (String result: students) {
			System.out.println(result);
		}
	}
	public static void sorting(String[] students, int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			int maximum = scores[i];
			int max_index = i;
			String temporary;
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[j] > maximum) {
					maximum = scores[j];
					max_index = j;
				}
			}
			
			if (max_index != i) {
				temporary =students[i];
				students[i] = students[max_index];
				students[max_index] = temporary;
				scores[max_index] = scores[i];
				scores[i] = maximum;
			}
		}
    }
    
}
