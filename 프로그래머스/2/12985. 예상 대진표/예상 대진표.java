class Solution{
    public int solution(int n, int a, int b){
        int round = 1;
        
        while (true) {
            a = (a + 1) >> 1;
            b = (b + 1) >> 1;
            
            if (a == b) {
                return round;
            }
            
            round++;
        }
    }
}