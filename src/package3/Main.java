package package3;

public class Main {
    public static void main(String[] args) {
       Wolf wolf= new Wolf(10,true,35);
        wolf.toLive();
        wolf.wildLive();
        wolf.fear();
        Fox fox=new Fox(5,true,75);
        fox.toLive();
        fox.wildLive();
        fox.eat();
        Dog dog =new Dog(15,"sharik","Vasya Otvertkin");
        dog.toLive();
        dog.petLive();
        dog.voice();
        Cat cat= new Cat(18,"matroskin","black");
        cat.toLive();
        cat.petLive();
        cat.catVoice();
    }
}
