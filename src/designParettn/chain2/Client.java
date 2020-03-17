package designParettn.chain2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Handle> handles = Arrays.asList(new Handle() {
            @Override
            public void process() {
                System.out.println("i am A");
            }
        }, new Handle() {
            @Override
            public void process() {
                System.out.println("i am B");
            }
        }, new Handle() {
            @Override
            public void process() {
                System.out.println("i am C");
            }
        }, new Handle() {
            @Override
            public void process() {
                System.out.println("i am d");
            }
        });
        Chain chain = new Chain(handles);
        chain.execute();
    }
}
