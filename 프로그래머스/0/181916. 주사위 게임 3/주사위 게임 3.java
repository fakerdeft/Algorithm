class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a == b && b == c && c == d){
            return 1111 * a;
        }
        if((a == b && b == c) || (a == b && b == d) || (a == c && c == d) || (b == c && c == d)){
            if(a == b && b == c){
                return (10 * a + d) * (10 * a + d);
            }
            if(a == b && b == d){
                return (10 * a + c) * (10 * a + c);
            }
            if(a == c && c == d){
                return (10 * a + b) * (10 * a + b);
            }
            return (10 * b + a) * (10 * b + a);
        }
        if((a == b && c == d) || (a == c && b == d) || (a == d && b == c)){
            if(a == b && c == d){
                return (a + c) * (a - c);
            }
            return a > b ? (a + b) * (a - b) : (a + b) * (b - a);
        }
        if((a == b && c != d) || (a == c && b != d) || (a == d && b != c) || (b == c && a != d) || (b == d && a != c) || (c == d && a != b)){
            if(c == d){
                return a * b;
            }
            if(b == d){
                return a * c;
            }
            if(b == c){
                return a * d;
            }
            if(a == d){
                return b * c;
            }
            if(a == c){
                return b * d;
            }
            return c * d;
        }
        return a < b && a < c && a < d ? a : b < a && b < c && b < d ? b : c < a && c < b && c < d ? c : d;
    }
}