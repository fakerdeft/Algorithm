import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for(int num : arr){
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        
        List<Integer> modeList = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == maxCount) {
                modeList.add(key);
            }
        }
        
        Collections.sort(modeList);
        int mode = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0);
        
        sb.append(Math.round((double)sum / n)).append("\n")
            .append(arr[n/2]).append("\n")
            .append(mode).append("\n")
            .append(arr[n-1] - arr[0]);
        
        System.out.print(sb);
    }
}