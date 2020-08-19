package package3;

public class Dog extends Pet {
    String owner;

    public Dog(int lifeLength, String nickName, String owner) {
        super(lifeLength, nickName);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
 void voice(){
    System.out.println("wow,wow");
}
    @Override
    public String toString() {
        return "Dog{" +
                "owner='" + owner + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
