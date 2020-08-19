package package7;

import java.util.ArrayList;

public class Class1  implements ICreator{
private int length;

    public Class1(int length) {
        this.length = length;
    }

    @Override
    public ArrayList creator() {
        ArrayList arrayList=new ArrayList();
        for (int i = 0; i < length; i++) {
arrayList.add((int)(Math.random()*Y));
        }
        return arrayList;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
