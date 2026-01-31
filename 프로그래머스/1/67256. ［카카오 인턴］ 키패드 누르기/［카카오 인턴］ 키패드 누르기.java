import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String h = hand.equals("left") ? "L" : "R";
        Map<String, int[]> map = new HashMap<>();
        map.put("L", new int[]{1, 4});
        map.put("R", new int[]{3, 4});
        
        for(int num : numbers){
            int[] lPos = map.get("L");
            int[] rPos = map.get("R");
            
            if(num == 1 || num == 4 || num == 7){
                answer += "L";
                map.put("L", new int[]{1, (num / 3) + 1});
            }
            
            if(num == 3 || num == 6 || num == 9){
                answer += "R";
                map.put("R", new int[]{3, (num / 3)});
            }
            
            if(num == 2){
                int lD = getDistance(2, 1, lPos[0], lPos[1]);
                int rD = getDistance(2, 1, rPos[0], rPos[1]);
                
                if(lD < rD){
                    answer += "L";
                    map.put("L", new int[]{2, 1});
                } else if (lD > rD){
                    answer += "R";
                    map.put("R", new int[]{2, 1});
                } else {
                    answer += h;
                    map.put(h, new int[]{2, 1});
                }
            }
            
            if(num == 5){
                int lD = getDistance(2, 2, lPos[0], lPos[1]);
                int rD = getDistance(2, 2, rPos[0], rPos[1]);
                
                if(lD < rD){
                    answer += "L";
                    map.put("L", new int[]{2, 2});
                } else if (lD > rD){
                    answer += "R";
                    map.put("R", new int[]{2, 2});
                } else {
                    answer += h;
                    map.put(h, new int[]{2, 2});
                }
            }
            
            if(num == 8){
                int lD = getDistance(2, 3, lPos[0], lPos[1]);
                int rD = getDistance(2, 3, rPos[0], rPos[1]);
                
                if(lD < rD){
                    answer += "L";
                    map.put("L", new int[]{2, 3});
                } else if (lD > rD){
                    answer += "R";
                    map.put("R", new int[]{2, 3});
                } else {
                    answer += h;
                    map.put(h, new int[]{2, 3});
                }
            }
            
            if(num == 0){
                int lD = getDistance(2, 4, lPos[0], lPos[1]);
                int rD = getDistance(2, 4, rPos[0], rPos[1]);
                
                if(lD < rD){
                    answer += "L";
                    map.put("L", new int[]{2, 4});
                } else if (lD > rD){
                    answer += "R";
                    map.put("R", new int[]{2, 4});
                } else {
                    answer += h;
                    map.put(h, new int[]{2, 4});
                }
            }
        }
        
        return answer;
    }
    
    private int getDistance(int x1, int y1, int x2, int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}