import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int r1=a*(b%10);
        int r2=a*((b/10)%10);
        int r3=a*(b/100);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(a*b);
        
    }
    
}