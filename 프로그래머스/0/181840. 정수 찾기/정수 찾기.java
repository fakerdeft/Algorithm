import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
    // num_list 스트림을 생성하고, n과 일치하는 요소가 있는지 확인
    boolean exists = Arrays.stream(num_list).anyMatch(i -> i == n);

    // 존재한다면 1을, 그렇지 않다면 0을 반환
    return exists ? 1 : 0;
 }
}