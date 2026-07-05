public class constructerOverload {
    constructerOverload(int a){
        System.out.println(a);
    }
    constructerOverload(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        constructerOverload od=new constructerOverload(4);
    }
}
