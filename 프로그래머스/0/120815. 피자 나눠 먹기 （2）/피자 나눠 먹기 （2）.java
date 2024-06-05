class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int solution(int n) {
        int piecesPerPizza = 6;
        int lcm = (n * piecesPerPizza) / gcd(n, piecesPerPizza);
        return lcm / piecesPerPizza;
    }
}