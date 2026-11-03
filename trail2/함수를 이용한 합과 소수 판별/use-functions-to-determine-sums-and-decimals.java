import java.util.Scanner;
public class Main {

    public static boolean isprime(int i){
        for(int j = 2; j<i; j++){
            if(i%j==0) return false;
        }
        return true;
    }

    public static boolean isaddeven(int i){
        if(i!=100) if((i%10 + i/10)%2==0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = a; i<=b; i++){
            if(isprime(i)&&isaddeven(i)) count++;
        }
        System.out.print(count);
    }
}