import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=0,p=0,count=0;
		String A="";
		
		N=Integer.parseInt(bf.readLine());

		int[] arr = new int[N];//정수배열 생성

		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			A=st.nextToken();
			
			for(int j=0;j<A.length();j++) {
				if(A.toString().charAt(j)=='O') {
					p++;
					count+=p;
				}
				else if(A.toString().charAt(j)=='X') {
					p=0;
				}
			}
			arr[i]=count;
			bw.write(String.valueOf(arr[i]));
			bw.newLine();
			count=0;
			p=0;
		}
		
		bw.flush();
		bw.close();
	
	}//main메소드

}//class