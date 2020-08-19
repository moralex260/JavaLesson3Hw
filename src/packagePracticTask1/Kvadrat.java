package packagePracticTask1;

public class Kvadrat implements ISquare {
  private double side;

   public Kvadrat(double side) {
      this.side = side;
   }

   @Override
   public double square() {
      return Math.pow(side,2);
   }

   public double getSide() {
      return side;
   }

   public void setSide(double side) {
      this.side = side;
   }
}
