import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N=0,max=0,min=0;
		
		while(true) {	
			N = Integer.parseInt(bf.readLine());	
			if(1<=N&&N<=1000000) {
				
				int[] arr=new int[N];

				StringTokenizer st = new StringTokenizer(bf.readLine());
				
				for(int i=0;i<N;i++) {
					arr[i]=Integer.parseInt(st.nextToken());
				}
                max=arr[0];
				min=arr[0];
				for(int i=0;i<N;i++) {
					if(max<arr[i]) {
						max=arr[i];
					}
					if(min>arr[i]) {
						min=arr[i];
					}
				}				
				break;
				
			}//if(1<=N&&N<=1000000)		
			else {
				bw.write("1~1000000까지입니다.\n다시 입력:\n");
				bw.flush();
			}//else

		}//while
		bw.write(min+" "+max);
		bw.flush();
		bw.close();

	}//main메소드

}//class