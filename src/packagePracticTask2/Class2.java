package packagePracticTask2;

public class Class2 implements Runner,Singer {
    private String name;
    private String LastName;
    private String tembr;
    private int speed;

    public Class2(String name, String lastName, String tembr, int speed) {
        this.name = name;
        LastName = lastName;
        this.tembr = tembr;
        this.speed = speed;
    }

    @Override
    public void toRun() {
        System.out.println("I "+getName() +" " +getLastName() +" and I run,I am runner");
    }

    @Override
    public void toSing() {
        System.out.println("I "+getName() +" " +getLastName() +" and I run and Singing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTembr() {
        return tembr;
    }

    public void setTembr(String tembr) {
        this.tembr = tembr;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
