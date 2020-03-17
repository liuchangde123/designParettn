package designParettn.observer;

public class GameUser implements User{
    private String name;

    public GameUser(String name) {
        this.name = name;
    }

    @Override
    public boolean register(Publisher publisher) {
        if(publisher instanceof GamePulisher){
            return ((GamePulisher) publisher).add(this);
        }
        return false;
    }

    @Override
    public void recever(Integer integer) {
        System.out.println(this+"接受到数据:"+integer);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GameUser{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
