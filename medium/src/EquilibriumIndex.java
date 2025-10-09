import java.util.Scanner;

//Find equilibrium index (where left sum = right sum).
public class EquilibriumIndex {
    static int equilibrium(int arr[]){
        int rightSum=0,leftSum=0;
        for (int i = 0; i < arr.length; i++) {
            rightSum=rightSum+arr[i];

        }
        for (int j = 0; j < arr.length; j++) {
            rightSum=rightSum-arr[j];
            leftSum=leftSum+arr[j];
            if (leftSum == rightSum) {
                System.out.println("Equilibrium point:-"+j);
                return 1;
            }
        }
        System.out.println("There is no equilibrium point");
        return 0;
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
        equilibrium(arr);
    }
}
