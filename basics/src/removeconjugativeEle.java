import java.util.*;

public class removeconjugativeEle {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many element you should push");
        int a= sc.nextInt();
        for (int i = 0; i < a; i++) {
            li.add(sc.nextInt());
        }
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j <a ; j++) {
                if (li.get(i) != li.get(j)) {
                    break;

                }else {
                    li.remove(j);
                    a--;
                }

            }
        }
        System.out.println(li);
    }
}
