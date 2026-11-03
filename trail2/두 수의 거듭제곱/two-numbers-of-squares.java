import java.util.Scanner;

public class Main {

    public static int multip(int a, int b){
        int aa = a;
        for(int i = 1; i<b; i++){
            a*=aa;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = multip(a,b);
        System.out.print(mul);
    }
}