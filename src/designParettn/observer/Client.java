package designParettn.observer;

public class Client {

    public static void main(String[] args) {
        Publisher gamePulisher = new GamePulisher();
        User gameUser = new GameUser("张三");
        GameUser user = new GameUser("李四");
        gameUser.register(gamePulisher);
        user.register(gamePulisher);
        gamePulisher.publish();
        gamePulisher.notifyAllUser();
    }
}
