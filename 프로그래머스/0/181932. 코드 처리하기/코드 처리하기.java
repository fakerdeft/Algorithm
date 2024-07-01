class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (i % 2 == 0 && code.charAt(i) != '1') {
                    ret.append(code.charAt(i));
                }
                if (code.charAt(i) == '1') {
                    mode = 1;
                }
            } else {
                if (i % 2 == 1 && code.charAt(i) != '1') {
                    ret.append(code.charAt(i));
                }
                if (code.charAt(i) == '1') {
                    mode = 0;
                }
            }
        }
        if(ret.toString().equals("")){
            return "EMPTY";
        }

        return ret.toString();
    }
}