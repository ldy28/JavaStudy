package java0701;

import java.util.Random;

public class ex02랜덤 {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		Random rd = new Random(); // 난수를 생성하는 데이터 타입
		int number= rd.nextInt(20)+1; // 1~20 숫자 생성
		
		//난수로 초기화 하기 
		for(int i=0;i<10;i++) {
			array[i] = rd.nextInt(20)+1;
			
		}
		for(int i=0;i<10;i++) {
			System.out.print(array[i]+", ");
		}
	}

}
