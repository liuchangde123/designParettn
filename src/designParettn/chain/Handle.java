package designParettn.chain;

public abstract class Handle {
    private Handle other;

    public abstract void process();
    public void execute(){
        process();
        if(other!=null){
            other.execute();
        }
    }

    public void setOther(Handle other) {
        this.other = other;
    }
}
