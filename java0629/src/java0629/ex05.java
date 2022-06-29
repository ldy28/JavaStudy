package java0629;

public class ex05 {
	public static void main(String[] args) {
		for(int i=2;i<=1000;i++) {
			int k=0;
			for(int j=1;j<i;j++) {
				
				if(i%j==0) {
					
					k+=j; 
					if(i==k) {
						System.out.println(i);
					}
				}
			}
		}
	}
}
