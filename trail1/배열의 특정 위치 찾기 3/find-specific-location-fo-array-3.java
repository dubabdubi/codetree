import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[105];
        int i = 0;

        while (true) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                int sum = arr[i - 1] + arr[i - 2] + arr[i - 3];
                System.out.println(sum);
                break;
            }

            i++;
        }
    }
}