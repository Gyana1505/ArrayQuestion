import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        Integer arr[]=new Integer[x];
        for (int i = 0; i < x; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Large element:-"+arr[0]);
    }
}
