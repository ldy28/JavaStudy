package java0629;

public class ex03별찍기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i+1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
