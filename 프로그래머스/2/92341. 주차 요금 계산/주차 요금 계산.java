import java.util.HashMap;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 주차장 요금표
        int defaultTime = fees[0];
        int defaultPrice = fees[1];
        int partTime = fees[2];
        int partPrice = fees[3];
        
        // 주차 시간, 누적 주차 시간, 차 번호 세트
        HashMap<Integer, Integer> timeMap = new HashMap<>();
        HashMap<Integer, Integer> stackMap = new HashMap<>();
        TreeSet<Integer> carSet = new TreeSet<>();
        
        for(String record : records){
            String[] parts = record.split(" ");
            int checkTime = parseMinutes(parts[0]);
            int carNum = Integer.parseInt(parts[1]);
            String status = parts[2];
            
            carSet.add(carNum);
            
            if(status.equals("IN")){
                timeMap.put(carNum, checkTime);
            } else {
                int inTime = timeMap.remove(carNum);
                stackMap.put(carNum, stackMap.getOrDefault(carNum, 0) + checkTime - inTime);
            }
        }
        
        // 아직 안 나간 차 계산
        int lastTime = parseMinutes("23:59");
        for(Integer carNum : timeMap.keySet()){
            int inTime = timeMap.get(carNum);
            stackMap.put(carNum, stackMap.getOrDefault(carNum, 0) + lastTime - inTime);
        }
        
        // 요금 계산
        int[] answer = new int[carSet.size()];
        int i = 0;
        for(Integer carNum : carSet){
            int price = defaultPrice;
            int stackTime = stackMap.get(carNum);
            
            if(stackTime > defaultTime){
                price += Math.ceil((double)(stackTime - defaultTime) / partTime) * partPrice;
            }
            
            answer[i++] = price;
        }
        
        return answer;
    }
    
    private int parseMinutes(String time){
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        
        return (hours * 60) + minutes;
    }
}