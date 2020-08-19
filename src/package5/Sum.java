package package5;

public class Sum implements Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println(a+b);
    }
}
