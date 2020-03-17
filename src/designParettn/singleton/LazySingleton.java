package designParettn.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){};
    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized (instance){
                instance=new LazySingleton();
            }
        }
        return instance;

    }
}
