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

		int t=Integer.parseInt(bf.readLine());
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int k=0;
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			k+=i+1;
					
			bw.write("Case #"+k+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
	
		bw.flush();
		bw.close();
    }      
}