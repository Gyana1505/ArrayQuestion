import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frquency {
    static void freq(int arr[]){
        boolean isPresent[]=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (isPresent[i]){
                continue;
            }
            int count=1;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    isPresent[j]=true;
                    count++;
                }
            }
            System.out.println("Frequency of"+arr[i]+"is="+count);
        }
    }

    static void freqUsingMap(int arr[]){
        Map<Integer,Integer> mp=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i],mp.get(arr[i])+1 );
            }else {
                mp.put(arr[i],1 );
            }

        }
        for (int key:mp.keySet()){
            System.out.println("Frequency of"+key+"is="+mp.get(key));
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
        freq(arr);
        System.out.println(".........................");
        freqUsingMap(arr);
    }
}
