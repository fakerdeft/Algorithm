import java.util.*;
public class Main {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X=sc.nextInt();
		int N=sc.nextInt();
		int a=0,b=0,c=0;
		
		for(int i=1;i<=N;i++) {
			int z=sc.nextInt();
			a=z;
			int x=sc.nextInt();
			b=x;
			c+=a*b;
		}
		
		if(1<=X&&X<=1000000000&&1<=N&&N<=100&&
				1<=a&&a<=1000000&&1<=b&&b<=10) {
			if(c==X) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		
		}		
    }      
}
