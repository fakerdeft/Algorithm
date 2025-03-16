import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int min = Integer.parseInt(st.nextToken());
        int max = min;
        
        while(st.hasMoreTokens()){
            int currentNum = Integer.parseInt(st.nextToken());
            
            if(min > currentNum){
                min = currentNum;
            }
            
            if(max < currentNum){
                max = currentNum;
            }
        }
        
        return min + " " + max;
    }
}