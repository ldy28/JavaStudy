package java0624;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		//리팩토링 : 코드를 재구축하는 행위
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();
		
		if (score>=90) System.out.println("A학점입니다.");
		else if (score>=80) System.out.println("B학점입니다.");
		else if (score>=70) System.out.println("C학점입니다.");
		else System.out.println("D학점입니다.");
	}
}
