package java0627;


import java.util.Scanner;

public class ex01자판기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >>");
		int menu = sc.nextInt();
		
		int coke = 800;
		int water = 500;
		int vitamin = 1500;
		int a =0;
		
		if(menu==1&&money>=coke) {
			money-=coke;
		}else if(menu==2&&money>=water) {
			money-=water;
		}else if(menu==3&&money>=vitamin) {
			money-=vitamin;
		}else {
			System.out.println("잔돈이 부족합니다.");
			System.out.println("잔돈 :"+money+"원");
		}
		System.out.println("잔돈 :"+money+"원");
		System.out.print("천원 : "+money/1000+"개, ");
		System.out.print("오백원 : "+money%1000/500+"개, ");
		System.out.print("백원 : "+money%1000%500/100+"개");
		
		
		switch (menu) {
		case 1:
			a=money-coke;
			break;
		case 2:
			a=money-water;
			break;
		case 3:
			a=money-vitamin;
		default:
			break;
		}
		if (a>=0) {
			System.out.println("잔돈 :"+a+"원");
			System.out.print("천원 : "+a/1000+"개, ");
			System.out.print("오백원 : "+a%1000/500+"개, ");
			System.out.print("백원 : "+a%1000%500/100+"개");
		}else {
			System.out.println("돈이 부족합니다.");
			System.out.println("잔돈 :"+money+"원");
		}
		
	}
}
