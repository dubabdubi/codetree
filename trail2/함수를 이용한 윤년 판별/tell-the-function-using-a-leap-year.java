import java.util.Scanner;

public class Main {

    public static boolean yyear(int y){
        if(y%4!=0) return false;
        else if(y%100==0 && y%400!=0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(!yyear(y)) System.out.print("false");
        else System.out.print("true");
    }
}