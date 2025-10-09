import java.util.*;

public class RemoveDuplicate {
    static Integer[] remove(Integer arr[]){
        ArrayList<Integer> li=new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < li.size(); i++) {
            for (int j = i+1; j <li.size() ; j++) {
                if (li.get(i)==li.get(j)){
                    li.remove(j);
                }

            }
        }
        return  li.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        //Easy Way

//        Integer arr[]={1,9,9,5,2,0,8,0,1};
//        Set<Integer> sc=new HashSet<>(Arrays.asList(arr));
//        System.out.println(sc);


        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of element");
        int x=sc.nextInt();
        Integer arr[]=new Integer[x];
        for (int i = 0; i < x; i++) {
            arr[i]= sc.nextInt();
        }
        int a[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(remove(arr)));


    }
}
