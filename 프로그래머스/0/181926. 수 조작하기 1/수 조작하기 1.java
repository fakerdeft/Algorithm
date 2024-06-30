class Solution {
    public int solution(int n, String control) {
    int[] answer = {n};
        
    control.chars()
          .mapToObj(c -> (char) c)
          .forEach(c -> {
              switch (c) {
                  case 'w':
                      answer[0]++;
                      break;
                  case 's':
                      answer[0]--;
                      break;
                  case 'd':
                      answer[0] += 10;
                      break;
                  case 'a':
                      answer[0] -= 10;
                      break;
              }
          });

    return answer[0];
}
}