import java.util.*;
class Main{

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(a>0) {
        	if(b>0) {
        		System.out.print("1");
        	}
        	else {
        		System.out.print("4");
        	}
        }
        else if(a<0) {
        	if(b>0) {
        		System.out.print("2");
        	}
        	else {
        		System.out.print("3");
        	}
        }
       
			   
	}

}