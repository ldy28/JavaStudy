package java0623;

import java.util.Scanner;

public class ex01Scanner사용 {
	public static void main(String[] args) {
		// Scanner : 사용자로 부터 입력을 받을 수 있는 데이터타입
		// 변수의 선언과 초기화 
		int num = 11;
		
		// 데이터타입 변수명 = 초기값; / Sysytem.in = 표준입력장치랑 연결
		System.out.println("정수입력 >>");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 정수를 입력받는 기능
		System.out.println(input);
		
		System.out.println("좋아하는 과일을 입력하세요>>");
		String inputStr = sc.next();
		System.out.println(inputStr);
		
	}
}
