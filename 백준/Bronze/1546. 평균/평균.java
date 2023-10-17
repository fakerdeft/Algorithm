import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=0,count=0,count3=0;
		double count2=0,result=0,M=0,R=0;
		
		N=Integer.parseInt(bf.readLine()); //시험 본 과목의 개수
		StringTokenizer st = new StringTokenizer(bf.readLine()); //시험 본 과목들의 점수
	
		if(0<N&&N<=1000) {//1000개 이하의 과목 개수			
		
			double[] arr =new double[N];//N크기만큼의 객체 생성
			
			for(int i=0;i<N;i++) {//과목의 개수만큼 배열에 저장
				result=Integer.parseInt(st.nextToken());//성적 입력
				if(0<=result&&result<=100) {//성적이 0이상 100이하일 경우
					arr[i]=result;
					if(arr[i]==0) {//0점이 입력됐을 경우
						count++;
					}
				}
			}
			
			if(count!=N) {//점수가 적어도 하나라도 0 이상일 경우
				if(N==1) {
					M=arr[0];
				}
				else if(N>1) {
					M=arr[0];
					for(int i=0;i<N-1;i++) {
						if(arr[i+1]>M) {//i+1번째 인덱스값이 i보다 클 경우
							M=arr[i+1];
						}
						else if(arr[i+1]==M){//같을 경우
							count3++;
						}
						if(count3==N-1) {//다 같을 경우
							M=arr[0];
						}
					}
					
				}
					
				for(int i=0;i<N;i++) {//모든 점수를 현재점수/M*100으로 고치기
					arr[i]=(arr[i]/M)*100;
					count2+=arr[i];
				}
					
					R=count2/N; //전체 평균
					bw.write(String.valueOf(R));
					bw.flush(); //남아있는 데이터 전부 출력
					bw.close(); //버퍼 닫기
			}//if(count!=N)
			else {//점수가 다 0일 경우
				System.out.println("ㅗ");
			}
			
		}//if(0<N&&N<=1000)
		else {
			System.out.println("N잘못 입력.");
		}
		
		
	}//main메소드

}//class