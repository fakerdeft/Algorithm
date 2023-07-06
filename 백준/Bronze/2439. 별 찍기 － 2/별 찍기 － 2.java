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

		for(int i=1;i<=t;i++) {
			for(int j=t-1;j>=0;j--) {
				if(i>j) {
					bw.write("*");
				}
				else {
					bw.write(" ");
				}
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
    }      
}