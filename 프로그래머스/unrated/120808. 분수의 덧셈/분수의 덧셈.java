class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int resultNumer = numer1 * denom2 + numer2 * denom1;
        int resultDenom = denom1 * denom2;
        int gcd = gcd(resultNumer, resultDenom);
        
        answer[0] = resultNumer / gcd;
        answer[1] = resultDenom / gcd;
        return answer;
    }
    
    static int gcd(int numer, int denom){
        if (denom == 0) return numer;
        return gcd(denom, numer % denom);
    }
}