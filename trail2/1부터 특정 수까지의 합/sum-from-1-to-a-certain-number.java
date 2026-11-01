import java.util.Scanner;
public class Main {
    
    public static int summ(int n){
        int sum = 0;
        for(int i = 0 ; i<=n;i++){
            sum += i;
        }
        n = sum;
        return n/10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = summ(n);
        System.out.print(sum);
    }
}