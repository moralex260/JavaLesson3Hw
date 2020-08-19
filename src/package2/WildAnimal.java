package package2;

public class WildAnimal extends Animal {
    boolean isPredator;

    public WildAnimal(int lifeLength, boolean isPredator) {
        super(lifeLength);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "isPredator=" + isPredator +
                '}';
    }
}
