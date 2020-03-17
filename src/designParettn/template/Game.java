package designParettn.template;

public abstract class Game {
    abstract void start();
    abstract void play();
    abstract void end();

    public final void doIt(){
        start();
        play();
        end();
    }
}
