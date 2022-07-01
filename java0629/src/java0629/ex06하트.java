package java0629;

public class ex06하트 {
	public static void main(String[] args) {
		for(int i=1,k=3;i<=2;i++,k-=2){
            for(int j=2;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=k;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=6;i>=1;i--) {
			for(int j=6;j>=i+1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
}
