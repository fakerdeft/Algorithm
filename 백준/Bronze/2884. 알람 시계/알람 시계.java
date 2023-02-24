import java.util.*;
public class Main {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        // 0<=a<=23    0<=b<=59
        
        if((0<=a&&a<=23)&&(0<=b&&b<=59)) {
        	if(b-45<0) {
        		if(a==0) {
        			a=23;
        			System.out.println(a);
        			System.out.println(60-(45-b));
        		}
        		else {
        			System.out.println(a-1);
        			System.out.println(60-(45-b));        			
        		}
        	}
        	else {
        		System.out.println(a);
        		System.out.println(b-45);
        	}
        }
        
	}
}