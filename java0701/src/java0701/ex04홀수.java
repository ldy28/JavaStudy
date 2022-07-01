package java0701;

import java.util.Random;

public class ex04홀수 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] array= new int[10];
		
		for(int i=0;i<array.length;i++) {
			array[i]= rd.nextInt(100)+1;
		}
		
		int cnt = 0;
		System.out.print("array에 들어있는 홀수는 ");
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==1) {
				System.out.print(array[i]+" ");
				cnt++;
			}
		}
		System.out.print("이며,\n총 "+cnt+"개 입니다.");
	}
}
