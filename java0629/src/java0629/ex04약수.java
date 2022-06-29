package java0629;

public class ex04약수 {
	public static void main(String[] args) {
		for(int i=2;i<=30;i++) {
			System.out.print(i+"의 약수 : 1 ");
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
				System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
