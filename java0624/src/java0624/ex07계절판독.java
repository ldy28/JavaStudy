package java0624;

import java.util.Scanner;

public class ex07계절판독 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int i = sc.nextInt();
		String season="";
		
		switch (i) {
		case 12:
		case 1:
		case 2:	
			season="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season="봄";
			break;
		case 6:
		case 7:
		case 8:
			season="여름";
			break;
		case 9:
		case 10:
		case 11:
			season="가을";
			break;
		}
		System.out.println(i+"월은 "+season+"입니다.");
		
	}
}
