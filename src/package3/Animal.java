package package3;

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
protected void toLive(){
    System.out.println("I live");
}
    @Override
    public String toString() {
        return "Animal{" +
                "lifeLength=" + lifeLength +
                '}';
    }
}
