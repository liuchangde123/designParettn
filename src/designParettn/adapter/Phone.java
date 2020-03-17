package designParettn.adapter;

public class Phone {
    private FangKong fangKong;

    public Phone(FangKong fangKong) {
        this.fangKong = fangKong;
    }

    public void listenMusic(){
        this.fangKong.listenByFangKong();
    }
}
