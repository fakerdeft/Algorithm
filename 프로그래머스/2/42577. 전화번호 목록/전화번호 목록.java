import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> s = new HashSet<>();
        
        for(String phone : phone_book){
            s.add(phone);
        }
        
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                String prefix = phone.substring(0, i);
                
                if (s.contains(prefix)) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}