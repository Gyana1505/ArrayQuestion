import java.util.Scanner;

public class SumAndAvg {
    static int sum(int []arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        int arr[]=new int[x];
        // it is code for enter element in array
        for (int i = 0; i < x; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Sum of ele="+sum(arr));
        System.out.println("Avg of ele="+(float)sum(arr)/arr.length);
    }
}
