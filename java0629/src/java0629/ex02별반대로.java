package java0629;

public class ex02별반대로 {
	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
