import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();
        int[] scores = {0, 3, 2, 1, 0, 1, 2, 3};

        for(int i = 0; i < survey.length; i++){
            int choice = choices[i];
            
            if(choice == 4) continue;

            char target = (choice < 4) ? survey[i].charAt(0) : survey[i].charAt(1);

            map.put(target, map.getOrDefault(target, 0) + scores[choice]);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? "R" : "T");
        sb.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? "C" : "F");
        sb.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? "J" : "M");
        sb.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? "A" : "N");
        
        return sb.toString();
    }
}