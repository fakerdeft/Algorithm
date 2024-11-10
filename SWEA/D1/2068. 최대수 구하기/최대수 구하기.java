import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int max = 0;
            for (int j = 0; j < 10; j++) {
                int input = sc.nextInt();
                if (max <= input) {
                    max = input;
                }
            }
            System.out.println("#" + i + " " + max);
        }
    }
}