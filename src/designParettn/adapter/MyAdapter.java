package designParettn.adapter;

public class MyAdapter extends YuanKong implements FangKong {
    @Override
    public void listenByFangKong() {
        listenByYuanKong();
    }
}
