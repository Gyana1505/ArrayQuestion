import java.util.Scanner;

public class missingNo {
    //Find missing number in an array from 1 to N.

    static int missing(int arr[]){
        int num=0,len= arr.length+1;
        int sum=(len*(len+1))/2;
        for (int i = 0; i < arr.length; i++) {
            num=num+arr[i];
        }

        return sum-num;
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
    }
}
