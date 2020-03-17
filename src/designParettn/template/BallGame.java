package designParettn.template;

public class BallGame extends Game {
    @Override
    void start() {
        System.out.println("开始篮球比赛");
    }

    @Override
    void play() {
        System.out.println("打球");
    }

    @Override
    void end() {
        System.out.println("结束");
    }
}
