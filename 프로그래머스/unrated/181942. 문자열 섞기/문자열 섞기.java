class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str2.length(); i++){
            if(str1.substring(i,i+1)!=null){
                answer += str1.substring(i,i+1)+str2.substring(i,i+1);
            }else{
                answer += str2.substring(i,i+1);
            }
        }
        return answer;
    }
}