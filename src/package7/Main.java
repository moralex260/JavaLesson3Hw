package package7;

public class Main {
    public static void main(String[] args) {
        ICreator iCreator=new Class1(20);
        ICreator iCreator1=new Class2(10,500);
        System.out.println(iCreator.creator());
        System.out.println(iCreator1.creator());
    }
}
