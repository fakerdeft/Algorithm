import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//				StringTokenizer st = new StringTokenizer(bf.readLine());
		int max=0,count=1,a=0;
		
		int[] arr=new int[9]; //배열 생성
		
			for(int i=0;i<arr.length;i++){//배열에 입력한 수 넣기
				a=Integer.parseInt(bf.readLine());
				if(0<a&&a<100) {//1~99수를 입력한 경우
					if(i>0) {
						if(a==arr[i-1]) {
							bw.write("다시 입력:");
							bw.flush();
							i--;
							continue;
						}
					}
					arr[i]=a;
				}
				else {//0이하 or 100이상의 수를 입력한 경우
					bw.write("다시 입력:");
					bw.flush();
					i--;
				}
			}//for
			
			max=arr[0];
			for(int i=0;i<arr.length;i++){//최댓값 계산
				if(max<arr[i]) {
					max=arr[i];
					count=i+1;
				}
			}//for

		bw.write(String.valueOf(max));//최댓값 출력
		bw.newLine();
		bw.write(String.valueOf(count));//몇 번째 수인지 출력
		bw.flush();
		bw.close();
		
	}//main메소드

}//class
