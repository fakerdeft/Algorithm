import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n+2];
        int answer = n;
        
        for(int r : reserve){
            students[r]++;
        }
        
        for(int l : lost){
            students[l]--;
        }
        
        for(int i = 1; i <= n; i++){
            if(students[i] == -1){
                if(students[i-1] == 1){
                    students[i-1]--;
                    students[i]++;
                }
                else if(students[i+1] == 1){
                    students[i]++;
                    students[i+1]--;
                }
                else answer--;
            }
        }
        
        return answer;
    }
}