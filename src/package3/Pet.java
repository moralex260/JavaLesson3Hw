package package3;

public class Pet extends Animal {
    String nickName;

    public Pet(int lifeLength, String nickName) {
        super(lifeLength);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    protected void toLive() {
        super.toLive();
    }
void petLive(){
    System.out.println("I live  with human" );
}
    @Override
    public String toString() {
        return "Pet{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
