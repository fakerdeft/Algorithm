class Solution {
    public int solution(int a, int b) {
        String x = Integer.toString(a) + Integer.toString(b);
        String y = Integer.toString(2 * a * b);
        
        if(Integer.parseInt(x) == Integer.parseInt(y)){
            return Integer.parseInt(x);
        }
        if(Integer.parseInt(x) > Integer.parseInt(y)){
            return Integer.parseInt(x);
        }
        return Integer.parseInt(y);
    }
}