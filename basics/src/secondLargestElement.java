import java.util.Scanner;

public class secondLargestElement {
    static int secoLarg(int arr[]){
        int fir=arr[0];
        int sec=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>fir) {
                sec=fir;
                fir=arr[i];
            }
            if (arr[i] <fir && arr[i]>sec) {
                sec=arr[i];
            }
        }
        return sec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        int arr[]=new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Second Large-"+secoLarg(arr));

    }
}
