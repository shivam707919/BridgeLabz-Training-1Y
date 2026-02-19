package Interface;

public class Test {
    public static void main() {
        Calculator c=(int a,int b) -> a+b; //lamda use
        System.out.println(c.add(5,7));
    }
}
