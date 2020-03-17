package designParettn.template;

public class ShootGame extends Game {
    @Override
    void start() {
        System.out.println("瞄准靶子");
    }

    @Override
    void play() {
        System.out.println("设计");
    }

    @Override
    void end() {
        System.out.println("中靶");
    }
}
