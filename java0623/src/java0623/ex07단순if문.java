package java0623;

import java.util.Scanner;

public class ex07단순if문 {
	public static void main(String[] args) {
		// 사용자로부터 나이를 입력받고 20살 이상이면
		// 성인입니다.를 출력하는 프로그램을 만들어보자
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
	}
}
