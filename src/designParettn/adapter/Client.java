package designParettn.adapter;

public class Client {
    public static void main(String[] args) {
        new Phone(new MyAdapter()).listenMusic();
    }
}
