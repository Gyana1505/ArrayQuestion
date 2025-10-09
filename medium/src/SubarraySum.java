import java.util.Scanner;

//Find subarray with given sum.
public class SubarraySum {
    static void  subarr(int arr[],int target){
        int start=0,sum=0,end=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            while (sum>target && start<=i){
                sum=sum-arr[start];
                start++;
            }
            if (sum == target) {
                end=i;
                break;
            }
        }
        if(end !=0 ){
            System.out.println("sub Array");
            for (int i = start; i <= end ; i++) {
                System.out.println(arr[i]);
            }
        }else{
            System.out.println("sub array is not present");
        }

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
        System.out.println("Enter targeted sum");
        int target= sc.nextInt();
        subarr(arr,target);
    }
}
