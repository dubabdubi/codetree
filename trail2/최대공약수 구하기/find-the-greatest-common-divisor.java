import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        maxdiv(n, m);
    }
    public static void maxdiv(int n, int m){
        int max = 0;
        if(n>m) max = n;
        else max = m;
        while(true){
            if((n%max==0)&&(m%max==0)){
                System.out.print(max);
                break;
            }else max--;
        }

    }
}