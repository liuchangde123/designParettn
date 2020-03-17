package designParettn.chain2;

import java.util.List;

public class Chain {
    private List<Handle> list;
    private int index;
    public Chain(List<Handle> list) {
        this.list = list;
    }

    public void execute(){
        if(index>=list.size()){
            return;
        }
        list.get(index++).execute(this);
    }
}
