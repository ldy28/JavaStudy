package java0623;

public class ex03논리연산자 {
	public static void main(String[] args) {
		//참 또는 거짓을 표현하는 boolean타입을 계산하는 연산자
		//and , or , not
		
		//and : 양쪽이 모두 참인경우 참이 나오는 연산자
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		//or : 양쪽 중에 하나라도 참인 경우에 참이 나오는 연산자
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		//not : 논리타입의 값을 반대로 바꿔주는 연산자
		System.out.println(!true);
		System.out.println(!false);
	}
}
