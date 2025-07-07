import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> usedWords = new HashSet<>();
        
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            
            if (isInvalid(currentWord, words, i, usedWords)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                
                return answer;
            }
            
            usedWords.add(currentWord);
        }
        
        return answer;
    }
    
    private boolean isInvalid(String currentWord, String[] words, int index, Set<String> usedWords) {
        if (usedWords.contains(currentWord)) {
            return true;
        }
        
        if (index > 0) {
            String prevWord = words[index - 1];
            char lastChar = prevWord.charAt(prevWord.length() - 1);
            char firstChar = currentWord.charAt(0);
            
            if (lastChar != firstChar) {
                return true;
            }
        }
        
        return false;
    }
}