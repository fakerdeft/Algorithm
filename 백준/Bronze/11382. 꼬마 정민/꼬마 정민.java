import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        
        // A, B, C의 합을 계산
        long sum = A + B + C;

        System.out.println(sum);
        
        sc.close();
    }
}