package designParettn.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GamePulisher implements Publisher {
    private int num=0;
    private Vector<GameUser> list = new Vector<>(16);
    @Override
    public void notifyAllUser() {
        list.stream().forEach(x->x.recever(this.num));
    }

    @Override
    public void publish() {
      num++;
    }

    public boolean add(GameUser gameUser){
       return list.add(gameUser);
    }

    public boolean remove(GameUser gameUser){
        return list.remove(gameUser);
    }
}
