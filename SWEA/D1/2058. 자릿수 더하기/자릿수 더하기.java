import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
        int sum = 0;
		for(int i = 0; i < T.length(); i++) {
			sum += T.charAt(i) - '0';
		}
        System.out.print(sum);
	}
}