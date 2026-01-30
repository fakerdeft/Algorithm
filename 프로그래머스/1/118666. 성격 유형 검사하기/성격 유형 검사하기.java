import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < survey.length; i++){
            String s1 = String.valueOf(survey[i].charAt(0));
            String s2 = String.valueOf(survey[i].charAt(1));
            int choice = choices[i];
            
            switch(choice){
                case 1: 
                    map.put(s1, map.getOrDefault(s1, 0) + 3);
                    break;
                case 2:
                    map.put(s1, map.getOrDefault(s1, 0) + 2);
                    break;
                case 3: 
                    map.put(s1, map.getOrDefault(s1, 0) + 1);
                    break;
                case 5: 
                    map.put(s2, map.getOrDefault(s2, 0) + 1);
                    break;
                case 6: 
                    map.put(s2, map.getOrDefault(s2, 0) + 2);
                    break;
                case 7: 
                    map.put(s2, map.getOrDefault(s2, 0) + 3);
                    break;
            }
        }
        
        sb = map.getOrDefault("R", 0) >= map.getOrDefault("T", 0) ? sb.append("R") : sb.append("T");
        sb = map.getOrDefault("C", 0) >= map.getOrDefault("F", 0) ? sb.append("C") : sb.append("F");
        sb = map.getOrDefault("J", 0) >= map.getOrDefault("M", 0) ? sb.append("J") : sb.append("M");
        sb = map.getOrDefault("A", 0) >= map.getOrDefault("N", 0) ? sb.append("A") : sb.append("N");
        
        return sb.toString();
    }
}