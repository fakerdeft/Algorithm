import java.util.HashMap;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 주차장 요금표
        int defaultTime = fees[0];
        int defaultPrice = fees[1];
        int partTime = fees[2];
        int partPrice = fees[3];
        
        // 주차 시간, 출차 상태, 누적 주차 시간, 차 번호 세트
        HashMap<Integer, Integer> timeMap = new HashMap<>();
        HashMap<Integer, String> statusMap = new HashMap<>();
        HashMap<Integer, Integer> stackMap = new HashMap<>();
        TreeSet<Integer> carSet = new TreeSet<>();
        
        for(String record : records){
            String[] parts = record.split(" ");
            int checkTime = parseMinutes(parts[0]);
            int carNum = Integer.parseInt(parts[1]);
            String newStatus = parts[2];
            boolean exists = timeMap.containsKey(carNum);
            
            if(exists == false){
                timeMap.put(carNum, checkTime);
                stackMap.put(carNum, 0);
                carSet.add(carNum);
            } else {
                if(statusMap.get(carNum).equals("IN")){
                    stackMap.put(carNum, stackMap.getOrDefault(carNum, 0) + checkTime - timeMap.get(carNum));
                }
                
                if(statusMap.get(carNum).equals("OUT")){
                    timeMap.put(carNum, checkTime);
                }
            }
            
            statusMap.put(carNum, newStatus);
        }
        
        // 요금 계산
        int[] answer = new int[carSet.size()];
        int i = 0;
        for(Integer carNum : carSet){
            int price = 0;
            int stackTime = stackMap.get(carNum);
            
            if(statusMap.get(carNum).equals("IN")){
                stackTime += parseMinutes("23:59") - timeMap.get(carNum);
            }
            
            if(stackTime <= defaultTime){
                price += defaultPrice;
            } else {
                price += defaultPrice + Math.ceil((double)(stackTime - defaultTime) / partTime) * partPrice;
            }
            
            answer[i] = price;
            i++;
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