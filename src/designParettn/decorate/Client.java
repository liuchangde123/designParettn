package designParettn.decorate;

public class Client {
    public static void main(String[] args) {
       new RedBean(new DouJiang()).showAll();
    }
}
