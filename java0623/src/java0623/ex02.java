package java0623;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Java 점수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("Web 점수 입력 : ");
		int webScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int anScore = sc.nextInt();
		System.out
				.println("합계 : " + (javaScore + webScore + anScore) + "\n평균 : " + (javaScore + webScore + anScore) / 3.0f);

	}
}
