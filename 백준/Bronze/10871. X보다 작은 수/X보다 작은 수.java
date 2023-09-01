import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		StringTokenizer st =new StringTokenizer(bf.readLine());		
		int a=Integer.parseInt(st.nextToken());//수열에서 항의 갯수
		int b=Integer.parseInt(st.nextToken());//기준
		int d=0;
		
		st=new StringTokenizer(bf.readLine());//다음 줄
		
		for(int i=0;i<a;i++) {//수열 생성

			int c=Integer.parseInt(st.nextToken()); //항 입력
			
			if(b<=c) {//기준보다 항이 작은 경우
				continue;
			}
	
			bw.write(c+" ");
		}
		
		bw.close();
    }
}