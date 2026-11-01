import java.util.Scanner;
public class Main {
    public static int evenmul(int n){
        if((n%2==0)&&((n%10)+(n/10))%5==0) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int em = evenmul(n);
        if(em == 1) System.out.print("Yes");
        else System.out.print("No");
    }
}