package java0624;

import java.util.Scanner;

public class ex06switch_case문 {
	public static void main(String[] args) {
		//switch_Case사용하기
		// 간단 챗봇 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력해주세요 : ");
		String str = sc.nextLine(); //next() : 문자열 입력 nextline() enter까지 입력
		
		switch (str) {
		case "하이":
		case "안녕":
			System.out.println("안녕하세요");
			break;
		case "배고파":
			System.out.println("나도 배고파");
			break;

		default:
			System.out.println("뭐라는거야");
			break;
		}
	}
}
