import java.util.Scanner;
public class Main {

    public static int add(int a, char o, int c){
        return a+c;
    }
    
    public static int sub(int a, char o, int c){
        return a-c;
    }

    public static int mul(int a, char o, int c){
        return a*c;
    }

    public static int div(int a, char o, int c){
        return a/c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        if(o=='+') System.out.print(a + " + " + c + " = " + add(a,o,c));
        else if(o=='-') System.out.print(a + " - " + c + " = " + sub(a,o,c));
        else if(o=='*') System.out.print(a + " * " + c + " = " + mul(a,o,c));
        else if(o=='/') System.out.print(a + " / " + c + " = " + div(a,o,c));
        else System.out.print("False");
    }
}