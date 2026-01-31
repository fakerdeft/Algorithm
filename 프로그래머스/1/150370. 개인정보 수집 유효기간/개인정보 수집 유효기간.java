import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // (약관 종류 : 유효기간)
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String term : terms) {
            String[] parts = term.split(" ");
            map.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        // 오늘 날짜 일수로 환산
        int todayDays = parseDays(today);
        
        // 파기할 약관 계산
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < privacies.length; i++){
            String[] parts = privacies[i].split(" ");
            int validDays = parseDays(parts[0]) + map.get(parts[1]) * 28;
            
            if(validDays <= todayDays){
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    int parseDays(String date){
        String[] arr = date.split("\\.");
        int y = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);
        
        return (y * 12 * 28) + (m * 28) + d;
    }
}