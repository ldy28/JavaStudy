package java0623;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("노동시간을 입력하세요 : ");
		int a =sc.nextInt();
		int h = 5000;
		float up = 1.5f;
		float money=(a>8?h*8+(h*up)*(a-8):h*a);
		System.out.println("총 임금은 "+(int)money+"원 입니다");
	}
}
