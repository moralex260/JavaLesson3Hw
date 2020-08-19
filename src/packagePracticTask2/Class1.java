package packagePracticTask2;

public class Class1 implements Singer{
private String name;
private String LastName;
private String tembr;

    public Class1(String name, String lastName, String tembr) {
        this.name = name;
        LastName = lastName;
        this.tembr = tembr;
    }

    @Override
    public void toSing() {
        System.out.println("I "+getName() +" " +getLastName() +" and I sing ,I am Singer");
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
}
