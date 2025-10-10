class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] b1 = new String[n];
        String[] b2 = new String[n];
        
        for(int i = 0; i < n; i++){
            b1[i] = "0".repeat(n);
            b2[i] = "0".repeat(n);
        }
        
        for(int i = 0; i < n; i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            
            b1[i] = b1[i].substring(s1.length()) + s1;
            b2[i] = b2[i].substring(s2.length()) + s2;
        }

        for(int i = 0; i < n; i++){
            String temp = "";
            
            for(int j = 0; j < n; j++){
                if(b1[i].charAt(j) == '1' || b2[i].charAt(j) == '1'){
                    temp += "#";
                } else {
                    temp += " ";
                }
            }
            
            answer[i] = temp;
        }
        
        return answer;
    }
}