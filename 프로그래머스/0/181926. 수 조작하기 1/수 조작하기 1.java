class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] arr = new String[control.length()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = control.substring(i,i+1);
            
            if(arr[i].equals("w")){
                answer++;
            }
            if(arr[i].equals("s")){
                answer--;
            }
            if(arr[i].equals("d")){
                answer += 10;
            }
            if(arr[i].equals("a")){
                answer -= 10;
            }
        }
        
        return answer;
    }
}