package java0701;

import java.util.Scanner;

public class ex05채점프로그램2 {

	public static void main(String[] args) {
		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for(int i =0; i<input.length;i++) {
			
			System.out.print(i+1+"번답 >>");
			input[i] = sc.nextInt();
			
		}
		int[] a = {1,4,3,2,1};
		int[] b = {15,25,30,20,10};
		int cnt =0;
		System.out.println("정답확인");
		for(int i=0;i<input.length;i++) {
			if(input[i]==a[i]) {
				System.out.print("O ");
				cnt+=b[i];
			}else {
				System.out.print("X ");
			}
		}
		System.out.print("총점 : "+cnt);
			
		
		

	}

}
