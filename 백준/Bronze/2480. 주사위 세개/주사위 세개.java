import java.util.*;
public class Main {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int t1=10000+(a*1000); // case 1
        
        if(a==b&&b==c){ // 세 개의 수가 같을 경우
        	System.out.println(t1);        	
        }
        
        else if(a==b||b==c||a==c) { // 두 개의 수가 같을 경우
	        	if(a==b) {
	        		System.out.println((1000+a*100));        		
	        	}
	        	else if(b==c) {
	        		System.out.println((1000+b*100));  
	        	}
	        	else {
	        		System.out.println((1000+c*100));  
	        	}
	        }
        
        else if(a>b||b>c||c>a){
        	if(a>b) {
        		if(b>c) {
        			System.out.println(a*100);
        		}
        		else if(c>a){
        			System.out.println(c*100);
        		}
        		else {
        			System.out.println(a*100);
        		}
        	}
        	else if(b>c){
        		if(b>a) { 			
        			System.out.println(b*100);
        		}
        	}
        	else if(c>a){
        		if(c>b) {
        			System.out.println(c*100);        			
        		}
        	} 	
        } 
    }      
}