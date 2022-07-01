package java0701;

public class ex03arraySunAvg {
	public static void main(String[] args) {
		//정수형 배열 5칸 생성
		// 6, 15, 45 , 7 , 9로 초기화
		
		//배열안의 값들의 총합과 평균을 계산해보자
		
		int[] array = {6,15,45,7,9};
		int sum = 0;
		
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+(float)sum/array.length);
	}
}
