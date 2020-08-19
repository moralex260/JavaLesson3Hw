package package7;

import java.util.ArrayList;

public class Class2 implements ICreator {
private int length;
private int x;


    public Class2(int length, int x) {
        this.length = length;
        this.x = x;
    }

    @Override
    public ArrayList creator() {
        ArrayList arrayList=new ArrayList();
        for (int i = 0; i < length; i++) {
            arrayList.add((int)(Math.random()*x));

        }
        return arrayList;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
