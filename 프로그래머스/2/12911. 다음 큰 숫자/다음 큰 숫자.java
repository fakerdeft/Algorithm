class Solution {
    public int solution(int n) {
        int countOnes = Integer.bitCount(n);
        
        int next = n + 1;
        
        while (Integer.bitCount(next) != countOnes) {
            next++;
        }
        
        return next;
    }
}