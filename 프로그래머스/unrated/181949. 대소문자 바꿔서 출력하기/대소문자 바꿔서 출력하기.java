import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(char c : a.toCharArray()){
            if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
                continue;
            }
            answer += Character.toLowerCase(c);
        }
        
        System.out.println(answer);
    }
}