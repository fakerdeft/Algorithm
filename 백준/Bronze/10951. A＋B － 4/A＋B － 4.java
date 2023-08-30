
import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str=" ";	

		while((str=bf.readLine())!=null) {
			
			StringTokenizer st =new StringTokenizer(str);		
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());

			bw.write(String.valueOf(a+b));
			bw.newLine();
		
		}
		bw.flush();		
		bw.close();
    }
}
