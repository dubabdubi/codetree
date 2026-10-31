import java.util.Scanner;

public class Main {
    public static void minmul(int n , int m){
        int min = 2;
        if(n<m) min = n;
        else min = m;
        while(true){
            if((min%n==0) && (min%m==0)){
                System.out.print(min);
                break;
            }else{
                min++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        minmul(n, m);
    }
}