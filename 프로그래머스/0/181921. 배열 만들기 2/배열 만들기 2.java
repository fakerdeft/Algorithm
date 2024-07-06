import java.util.ArrayList;
import java.util.List;

class Solution {
    public static long[] solution(int l, int r) {
        List<Long> result = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isZeroOrFive(i)) {
                result.add((long) i);
            }
        }
        
        if (result.isEmpty()) {
            return new long[] { -1 };
        }
        
        long[] resultArray = new long[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        
        return resultArray;
    }
    
    private static boolean isZeroOrFive(int number) {
        String str = Integer.toString(number);
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}