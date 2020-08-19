package package5;

public class Main {
    public static void main(String[] args) {
        Division division=new Division();
        Sum sum=new Sum();
        Subtraction subtraction=new Subtraction();
        Multiplication multiplication=new Multiplication();
        division.calculate(5,0);
        Calculator calculator = (a, b)-> System.out.println(a * b);
        Calculator calculator1 = (a, b)-> System.out.println(a + b);
        Calculator calculator2 = (a, b)-> System.out.println(a - b);
calculator.calculate(5,2);
multiplication.calculate(5,2);
calculator1.calculate(4,2);
sum.calculate(4,2);
calculator2.calculate(3,3);
subtraction.calculate(3,3);


    }
}
