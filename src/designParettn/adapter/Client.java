package designParettn.adapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("----");
        new Phone(new MyAdapter()).listenMusic();
    }
}
