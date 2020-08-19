package package5;

public class Division extends Exception implements Calculator {
    @Override
    public void  calculate(int a, int b) {
        try {
            System.out.println((double ) (a / b));

        } catch (ArithmeticException ar) {
            System.out.println(ar.getMessage());
        }


    }
}
