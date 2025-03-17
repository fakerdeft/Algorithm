import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirst = true;
        
        for(String data : s.toLowerCase().split("")){
            answer += isFirst ? data.toUpperCase() : data;
            isFirst = data.equals(" ") ? true : false;
        }
        
        return answer;
    }
}