package package2;

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
    public String toString() {
        return "Pet{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
