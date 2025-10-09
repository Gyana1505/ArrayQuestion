// intersection of two array

import java.util.Arrays;
import java.util.Scanner;

public class intersectionOfArray {
    static void intersection(int arr1[],int arr2[]){
        System.out.println("insertion of arrays");
        boolean isIntersection=false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j=0;j< arr2.length;j++){
                if (arr1[i]==arr2[j]) {
                    System.out.println(arr1[i]);
                    isIntersection=true;
                    break;
                }
            }
        }
        if(!isIntersection){
            System.out.println("There is no insertion");
        }

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
        intersection(arr1,arr2);
    }
}
