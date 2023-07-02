import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t=Integer.parseInt(bf.readLine());
		String c="";
		
		for(int i=0;i<t;i++) {
		
			
			c+="*";
					
			bw.write(c+"\n");
		}
	
		bw.flush();
		bw.close();
    }      
}