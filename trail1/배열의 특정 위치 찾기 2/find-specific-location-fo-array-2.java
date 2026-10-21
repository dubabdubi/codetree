import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int oddsum = 0;
        int evensum = 0;
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
                oddsum+=arr[i];
            }else{
                evensum+=arr[i];
            }
        }
        if(oddsum>=evensum){
            System.out.print(oddsum-evensum);
        }else{
            System.out.print(evensum-oddsum);
        }
    }
}