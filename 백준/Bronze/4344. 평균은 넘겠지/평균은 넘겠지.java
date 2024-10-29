import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C=0,N=0,P=0,count=0,avg=0;
		double count2=0,rs=0;
		
		C=Integer.parseInt(bf.readLine());

		for(int i=0;i<C;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			N=Integer.parseInt(st.nextToken());
			int[] arr2 = new int[N];
			
			for(int j=0;j<N;j++) {				
				P=Integer.parseInt(st.nextToken());
				arr2[j]=P;
				count+=P;
			}
			avg=count/N;
			for(int j=0;j<N;j++) {
				if(arr2[j]>avg) {
						count2++;
				}
			}
			rs=(count2/N)*100;
			
			bw.write(String.format("%.3f", rs)+"%");
			bw.newLine();
			count=0;
			count2=0;
		}
		bw.flush();
		bw.close();
	
	}//main메소드

}//class