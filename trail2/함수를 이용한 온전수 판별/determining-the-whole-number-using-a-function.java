import java.util.Scanner;
public class Main {

    public static boolean good(int i){
        if(i%2==0) return false;
        else if(i%3==0 && i%9!=0) return false;
        else if(i%10==5) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cout = 0;
        for(int i = a; i<=b; i++){
            if(good(i)) cout++;
        }
        System.out.print(cout);
    }
}