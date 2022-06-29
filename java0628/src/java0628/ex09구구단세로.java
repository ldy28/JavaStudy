package java0628;

public class ex09구구단세로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			
			for(int j=2;j<=9;j++){
				if((j*i)/10==0) System.out.print(j+"*"+i+"="+(j*i)+"  ");
				else System.out.print(j+"*"+i+"="+(j*i)+" ");
				
			}
			System.out.println();
		}
	}

}
