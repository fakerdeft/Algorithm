class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        answer = x1 == false && x2 == false ? false : x1 == true && x2 == true ? x3 == true || x4 == true ? true : false : x3 == true || x4 == true ? true : false;
        
        return answer;
    }
}