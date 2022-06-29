package java0627;

import java.util.Scanner;

public class asdf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i =1;
		
		while (i <= a) {
			int j =0;
			while (j<i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
			
		}
	}
}
