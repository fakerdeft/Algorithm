import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//				StringTokenizer st = new StringTokenizer(bf.readLine());
		int A=0,B=0,count=0,count2=0,count3=0;
		
		int[] arr = new int[10]; //배열 생성
		
		for(int i=0;i<arr.length;i++) {//배열 길이만큼 반복
			A=Integer.parseInt(bf.readLine()); //값 입력받기
			B=A%42; //42로 나누기
			arr[i]=B; //나머지를 배열에 담기
		}
		
		for(int i=0;i<arr.length-1;i++) {//배열 길이만큼 반복
			for(int j=1;i+j<arr.length;j++) {//배열 길이만큼 반복
				if(arr[i]==arr[i+j]) {//i번째 인덱스 값이 i+j번째 인덱스 값이랑 같다면 카운트+1하고 반복문 탈출
					count++;
					break;
				}
			}
		}
		count2=arr.length-count; //입력한 숫자의 총 개수-중복횟수=서로 다른 값의 개수 
		
		
		bw.write(String.valueOf(count2)); //카운트2 출력
		bw.flush(); //남아있는 데이터 전부 출력
		bw.close(); //버퍼 닫기
		
	}//main메소드

}//class
