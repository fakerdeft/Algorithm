class Solution {
    public int solution(int[] num_list) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for (int num : num_list) {
            (num % 2 == 0 ? a : b).append(num);
        }
        
        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }
}