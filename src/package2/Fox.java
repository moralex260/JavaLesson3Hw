package package2;

public class Fox extends WildAnimal {
    int tailLength;

    public Fox(int lifeLength, boolean isPredator, int tailLength) {
        super(lifeLength, isPredator);
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "tailLength=" + tailLength +
                ", isPredator=" + isPredator +
                '}';
    }
}
