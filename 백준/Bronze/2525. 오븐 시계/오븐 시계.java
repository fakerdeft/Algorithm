import java.util.*;
public class Main {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int t1=(a+((b+c)/60))-24;
        int t2=(a+((b+c)/60));
        
        // 0<=a<=23    0<=b<=59  0<=c<=1000
        
        if((0<=a&&a<=23)&&(0<=b&&b<=59)&&(0<=c&&c<=1000)) {
        	if(b+c>=60&&(a+((b+c)/60))>=24) {
        		System.out.println(t1+" "+((b+(c%60))%60));
        	}
        	
        	else if(b+c<60){
        		System.out.println(a+" "+(b+c));
        	}
        	else if((a+((b+c)/60))<=24) {
        		System.out.println(t2+" "+((b+(c%60))%60));
        	}
        	
        		
//        	System.out.println(a+" "+b);//출력

        	}
    }
        
	
}
