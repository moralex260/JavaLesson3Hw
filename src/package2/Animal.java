package package2;

public class Animal {
private int lifeLength;

    public Animal(int lifeLength) {
        this.lifeLength = lifeLength;
    }

    public int getLifeLength() {
        return lifeLength;
    }

    public void setLifeLength(int lifeLength) {
        this.lifeLength = lifeLength;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "lifeLength=" + lifeLength +
                '}';
    }
}
