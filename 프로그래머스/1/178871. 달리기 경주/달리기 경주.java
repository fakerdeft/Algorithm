import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        int n = players.length;
        String[] answer = new String[n];

        // 선수들의 이름과 위치를 저장하는 HashMap을 생성합니다.
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(players[i], i);
        }

        // 해설진이 부른 선수의 이름에 따라 선수들의 위치를 변경합니다.
        for(String calling : callings){
            int index = map.get(calling);
            // index 선수와 index-1 선수의 위치를 바꿉니다.
            map.put(players[index - 1], index);
            map.put(calling, index - 1);
            players[index] = players[index - 1];
            players[index - 1] = calling;
        }

        // 최종적인 선수들의 순서를 answer에 저장합니다.
        for(int i = 0; i < n; i++){
            answer[i] = players[i];
        }
        
        return answer;
    }
}