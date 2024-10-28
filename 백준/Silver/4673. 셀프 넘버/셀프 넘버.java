public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[10001];
        arr[0] = true;
        for(int i = 1; i <= 10000; i++){
            int d = i;
            int sum = i;
            while(d > 0){
                sum += (d % 10);
                d /= 10;
            }
            if(sum <= 10000){
                arr[sum] = true;
            }
            if(!arr[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.print(sb);
    }
}