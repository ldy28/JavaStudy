package java0624;

import java.util.Scanner;

public class ex04마트계산대2 {
	public static void main(String[] args) {
		//선물셋트 구매할때 얼마를 지불해야되는지 계산하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 갯수 : ");
		int count = sc.nextInt();
		double discount = 1.0;
		
		if (count>=11) {
			discount-=0.1;
		}
		
		if(count%10==0) {
			discount-=0.05;
		}
		
		System.out.println("가격은 "+(int)(count*10000*discount)+"원 입니다.");
		
		
	}
}
