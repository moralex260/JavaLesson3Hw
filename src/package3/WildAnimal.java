package package3;

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
    protected void toLive() {
        super.toLive();

    }
void wildLive(){
    System.out.println("i live in wild nature");
}
    @Override
    public String toString() {
        return "WildAnimal{" +
                "isPredator=" + isPredator +
                '}';
    }
}
