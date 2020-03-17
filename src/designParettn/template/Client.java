package designParettn.template;

public class Client {
    public static void main(String[] args) {
        Game ballGame = new BallGame();
        Game shootGame = new ShootGame();
        ballGame.doIt();
        shootGame.doIt();
    }
}
