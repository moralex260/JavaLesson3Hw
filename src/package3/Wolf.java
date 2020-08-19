package package3;

public class Wolf extends WildAnimal {
    int weight;

    public Wolf(int lifeLength, boolean isPredator, int weight) {
        super(lifeLength, isPredator);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

 void fear(){

    System.out.println("I will eat you");
}
    @Override
    public String toString() {
        return "Wolf{" +
                "isPredator=" + isPredator +
                '}';
    }
}
