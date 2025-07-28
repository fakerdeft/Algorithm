import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int[] lg = new int[sizes.length];
        int[] sm = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                lg[i] = sizes[i][0];
                sm[i] = sizes[i][1];
            } else {
                lg[i] = sizes[i][1];
                sm[i] = sizes[i][0];
            }
        }
        
        Arrays.sort(lg);
        Arrays.sort(sm);
        
        return lg[sizes.length-1] * sm[sizes.length-1];
    }
}