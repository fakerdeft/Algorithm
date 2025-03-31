class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // 카펫의 전체 넓이
        int area = brown + yellow;
        
        // 가능한 가로, 세로 조합 찾기
        for (int height = 3; height <= Math.sqrt(area); height++) {
            if (area % height == 0) {
                int width = area / height;
                
                // 테두리가 갈색인 조건 확인
                int yellowArea = (width - 2) * (height - 2);
                if (yellowArea == yellow) {
                    answer[0] = width;  // 가로
                    answer[1] = height; // 세로
                    break;
                }
            }
        }
        
        return answer;
    }
}