import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamqustion {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(15);
        li.add(12);
        li.add(23);
        li.forEach(System.out::println);
        li.forEach((e)-> System.out.println(e+5));//forEach  return void se write like this we can not write directly e+1
        System.out.println("after ");
        Stream<Integer> st=li.stream().map(e->e+5);
        System.out.println(st);

    }
}
