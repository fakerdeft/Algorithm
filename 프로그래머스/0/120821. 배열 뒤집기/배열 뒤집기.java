import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // answer 배열을 num_list의 길이와 같은 크기로 초기화합니다.
        int[] answer = new int[num_list.length];
        
        // num_list의 Integer 버전을 생성합니다.
        Integer[] numListInteger = Arrays.stream(num_list).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(numListInteger);
        
        // 리스트를 뒤집습니다.
        Collections.reverse(list);
        
        // 뒤집힌 리스트의 값을 answer 배열에 복사합니다.
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}