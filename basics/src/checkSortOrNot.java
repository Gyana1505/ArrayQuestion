import java.util.Scanner;

public class checkSortOrNot {
    //Check if an array is sorted
    static boolean isSort(int []arr){
        boolean asc=true,des=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                asc=false;

            }
            if (arr[i]<arr[i+1]){
                des=false;
            }

        }
        return asc || des;
    }
    //Check if an array is sorted.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        int arr[]=new int[x];
        // it is code for enter element in array
        for (int i = 0; i < x; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(isSort(arr));

    }
}
