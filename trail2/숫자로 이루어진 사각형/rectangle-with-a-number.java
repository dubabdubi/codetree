import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Squ(n);
    }
    public static void Squ(int n){
        int k = 1;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=n;j++){
                if(k>9){
                    k = 1;
                    System.out.print(k + " ");
                }else System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}