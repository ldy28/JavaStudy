package java0624;

import java.util.Scanner;

public class ex04마트계산대 {
	public static void main(String[] args) {
		//선물셋트 구매할때 얼마를 지불해야되는지 계산하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 갯수 : ");
		int a = sc.nextInt();
		
		int set = 10000;
		/* double b = set*a*0.9;
		double c= set*a*0.85;
		double d = set*a*0.95;
		
		if (a>=11 && a%10==0) {
			System.out.println("가격은 "+(int) c +"원 입니다.");
		}else if (a>=11) {
			System.out.println("가격은 "+(int) b+"원 입니다.");
		}else if (a==10) {
			System.out.println("가격은 "+(int) d+"원 입니다.");
		}else {
			System.out.println("가격은 "+set*a+"원 입니다.");
		}*/
		double total=0;
		if (a%10==0) {
			if(a==10) {
			total = set*a*0.95;
			}else {
			total = set*a*0.85;
			}
		}else if(a>=11) {
			total = set*a*0.9;
		}else {
			total = set*a;
		}
		System.out.println("가격은 "+(int)total+"원 입니다.");
		
	}
}
