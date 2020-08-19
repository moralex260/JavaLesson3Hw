package packagePracticTask2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Singer> singers=new ArrayList<>();
        ArrayList<Runner> runners=new ArrayList<>();
Singer singer=new Class1("Vasya","Otvertkin","turbobas");
Singer singer2=new Class1("cocos","mocnyj","bas");
Singer singer3=new Class1("ananas","gniloy","tenor");
Singer singer4=new Class1("fruct","Ovosch","contralto");
Singer singer5=new Class1("Malina","Yagoda","bas");
singers.add(singer);
singers.add(singer2);
singers.add(singer3);
singers.add(singer4);
singers.add(singer5);
Class2 runner=new Class2("Petya","Petrov","tenor",25);
Class2 runner2=new Class2("Seroga","Sharikov","bass",25);
Class2 runner3=new Class2("Sanya","Sonya","falcet",25);
Class2 runner4=new Class2("Dasha","Nasha","garnyj",25);
Class2 runner5=new Class2("Taras","Fantomas","tenor",25);
runners.add(runner);
runners.add(runner2);
runners.add(runner3);
runners.add(runner4);
runners.add(runner5);
runner2.toRun();
runner4.toSing();
singer3.toSing();
    }

}
