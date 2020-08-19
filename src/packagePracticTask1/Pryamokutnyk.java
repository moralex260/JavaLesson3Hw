package packagePracticTask1;

public class Pryamokutnyk implements ISquare {
   private double width;
    private double heigth;

    public Pryamokutnyk(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double square() {
        return width*heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
}
