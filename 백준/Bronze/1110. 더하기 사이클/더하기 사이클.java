import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
	
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();//0~99 중 입력
		String s1="";
		String s2="";
		int count = 0, n1=0, t=0;
		int i=1;
		
		if(Integer.parseInt(s)<10) {
			s=s+"0";
		}
		
		
		s1=s;
		while(true) {//초기 값과 계산결과가 일치할 때까지 반복
			//일의 자리
			n1=Character.getNumericValue(s1.charAt(1)); 

			//십의 자리 숫자+일의 자리 숫자
			t=Character.getNumericValue(s1.charAt(0))+ n1; 			
			
			//주어진 수의 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리수를 붙이기
			s2=String.valueOf(s1.charAt(1))+Integer.toString(t%10);

			if(!s2.equals(s)) {
				s1=s2;
				i++;
				continue;
			}
			else {
				break;
			}
		}//while

		System.out.println(i);
		
		
	}//main

}//class