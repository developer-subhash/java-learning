import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args){
        System.out.println("hello world");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.forEach(n -> System.out.println(n));

        Consumer<Integer> lambdaMethod = n -> System.out.println(n);

        numbers.forEach(lambdaMethod);
    }
}
