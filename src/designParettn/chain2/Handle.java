package designParettn.chain2;

public abstract class Handle {
    public abstract void process();
    public void execute(Chain chain){
        process();
        chain.execute();
    }
}
