package package5;

public class Multiplication implements Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println( (a*b));
    }
}
