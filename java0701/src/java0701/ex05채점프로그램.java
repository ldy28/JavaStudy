package java0701;

import java.util.Scanner;

public class ex05채점프로그램 {

	public static void main(String[] args) {
		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for(int i =0; i<input.length;i++) {
			
			System.out.print(i+1+"번답 >>");
			input[i] = sc.nextInt();
			
		}
		System.out.print("입력한 답은 : ");
		for (int i=0; i<input.length;i++) {
			
			System.out.print(input[i]+" ");
		}
		
		
		

	}

}
