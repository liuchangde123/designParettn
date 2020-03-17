package designParettn.chain;

public class Client {
    public static void main(String[] args) {
        Handle a = new Handle() {
            @Override
            public void process() {
                System.out.println("i am A");
            }
        };
        Handle b = new Handle() {
            @Override
            public void process() {
                System.out.println("i am B");
            }
        };
        Handle c = new Handle() {
            @Override
            public void process() {
                System.out.println("i am C");
            }
        };
        b.setOther(c);
        a.setOther(b);
        a.execute();
    }
}
