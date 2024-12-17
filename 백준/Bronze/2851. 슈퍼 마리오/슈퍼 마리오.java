import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10]; // 버섯 점수 배열
        int sum = 0; // 버섯 점수 합
        
        // 버섯 배열에 점수 넣기
        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 버섯 점수 합 구하기
        for(int i = 0; i < 10; i++){
            sum += arr[i];
            if(sum == 100){
                break;
            }
            if(i < 9){
                if((sum < 100) && (sum + arr[i+1] > 100)){
                    if((100 - sum) < (sum + arr[i+1] - 100)){
                        break;
                    }
                    if((100 - sum) == (sum + arr[i+1] - 100)){
                        sum += arr[i+1];
                        break;
                    }
                }
                if(sum > 100){
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}