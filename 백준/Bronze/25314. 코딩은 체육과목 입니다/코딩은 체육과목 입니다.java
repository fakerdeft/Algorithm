import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N 바이트 입력 받기
        int N = scanner.nextInt();

        // long을 기본으로 하고, 4바이트 초과할 때마다 long 추가
        int longCount = (N / 4);

        StringBuilder dataTypeName = new StringBuilder();
        for (int i = 0; i < longCount; i++) {
            dataTypeName.append("long ");
        }
        dataTypeName.append("int");

        System.out.println(dataTypeName.toString());
        scanner.close();
    }
}
