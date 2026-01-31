import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] todayArr = today.split("\\."); //  ["2022", "05", "19"]
        int todayY = Integer.parseInt(todayArr[0]);
        int todayM = Integer.parseInt(todayArr[1]);
        int todayD = Integer.parseInt(todayArr[2]);
        int todayNum = todayY * 12 * 28 + todayM * 28 + todayD;
        HashMap<Integer, String[]> map = new HashMap<>(); // (1, ["20210519", "A"])
        StringTokenizer st;
        
        int key = 1;
        for(String privacy : privacies){
            st = new StringTokenizer(privacy);
            String[] arr = st.nextToken().split("\\.");
            int y = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int d = Integer.parseInt(arr[2]);
            
            map.put(key, new String[]{String.valueOf(y * 12 * 28 + m * 28 + d), st.nextToken()});
            key++;
        }
        
        // 각 개인정보에 기간 더하기
        for(String term : terms){
            st = new StringTokenizer(term);
            String type = st.nextToken();
            int addTime = Integer.parseInt(st.nextToken()) * 28;
            
            for(int i = 1; i <= map.size(); i++){
                if(map.get(i)[1].equals(type)){
                    String startDate = map.get(i)[0];
                    String endDate = String.valueOf(Integer.parseInt(startDate) + addTime);
                    
                    map.put(i, new String[]{endDate, type});
                };
            }
        }
        
        // 마감일과 오늘 날짜 비교
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= map.size(); i++){
            int deadLine = Integer.parseInt(map.get(i)[0]);
            
            if(deadLine <= todayNum){
                list.add(i);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}