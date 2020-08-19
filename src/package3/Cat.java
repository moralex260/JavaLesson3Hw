package package3;

public class Cat extends Pet {
    String color;

    public Cat(int lifeLength, String nickName, String color) {
        super(lifeLength, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 void catVoice(){
        System.out.println("myau,myau");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
