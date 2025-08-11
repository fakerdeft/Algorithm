import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        int c1 = 0, c2 = 0, c3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            int idx1 = i % 5;
            int idx2 = i % 8;
            int idx3 = i % 10;
            
            if(answers[i] == a1[idx1]) c1++;
            if(answers[i] == a2[idx2]) c2++;
            if(answers[i] == a3[idx3]) c3++;
        }
        
        int maxScore = Math.max(c1, Math.max(c2, c3));
        
        List<Integer> answer = new ArrayList<>();
        if(c1 == maxScore) answer.add(1);
        if(c2 == maxScore) answer.add(2);
        if(c3 == maxScore) answer.add(3);
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}