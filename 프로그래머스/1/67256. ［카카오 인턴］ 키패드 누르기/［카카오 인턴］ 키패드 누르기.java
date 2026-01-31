import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        int[][] pos = {
            {3, 1}, // 0
            {0, 0}, {0, 1}, {0, 2}, // 1, 2, 3
            {1, 0}, {1, 1}, {1, 2}, // 4, 5, 6
            {2, 0}, {2, 1}, {2, 2}, // 7, 8, 9
            {3, 0}, {3, 2} // *, #
        };
        int left = 10;
        int right = 11;
        
        for(int num : numbers){
            if(num == 1 || num == 4 || num == 7){
                sb.append("L");
                left = num;
            }
            
            else if(num == 3 || num == 6 || num == 9){
                sb.append("R");
                right = num;
            }
            
            else {
                int ld = getDist(pos[num][0], pos[num][1], pos[left][0], pos[left][1]);
                int rd = getDist(pos[num][0], pos[num][1], pos[right][0], pos[right][1]);

                if(ld < rd){
                    sb.append("L");
                    left = num;
                } else if(ld > rd){
                    sb.append("R");
                    right = num;
                } else {
                    if(hand.equals("left")){
                        sb.append("L");
                        left = num;
                    } else {
                        sb.append("R");
                        right = num;
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private int getDist(int r1, int c1, int r2, int c2){
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }
}