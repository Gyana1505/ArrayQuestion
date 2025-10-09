//union of two arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class unionOfArr {

    static Integer[] union(int arr1[],int arr2[]){
        int len1= arr1.length-1,len2= arr1.length-1;
        int k=Math.max(len1,len2);
        ArrayList<Integer> li=new ArrayList<>();
        int l=0;
        for (int i = 0; i <arr1.length; i++) {
            if (li.contains(arr1[i])){
                continue;
            }else {
                li.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (li.contains(arr2[i])){
                continue;
            }else {
                li.add(arr2[i]);
            }
        }
        return li.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        int arr1[]=new int[x];

        // it is code for enter element in array
        for (int i = 0; i < x; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("insert into 2nd element");
        int y=sc.nextInt();
        int arr2[]=new int[y];
        for (int i = 0; i < y; i++) {
            arr2[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(union(arr1,arr2)));

    }
}
