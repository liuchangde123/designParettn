package designParettn.zhongjie;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void chat(String message){
        CharRoom.show(this,message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
