import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 도난 0, 가능 1, 여벌 2
        int[] students = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
            students[i] = 1;
        }
        
        for(int r : reserve){
            students[r] = 2;
        }
        
        for(int l : lost){
            students[l]--;
        }
        
        for(int i = 1; i <= n; i++){
            if(students[i] == 0){
                if(i > 1 && students[i-1] == 2){
                    students[i-1]--;
                    students[i]++;
                }
                else if(i < n && students[i+1] == 2){
                    students[i]++;
                    students[i+1]--;
                }
            }
        }
        
        int answer = 0;
        for(int student : students){
            if(student >= 1){
                answer++;
            }
        }
        
        return answer;
    }
}