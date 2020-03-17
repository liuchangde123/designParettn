package designParettn.command;

import java.util.List;

public class Controller {
    private List<Command>list;

    public Controller(List<Command> list) {
        this.list = list;
    }

    public Controller() {
    }

    public void addCommand(Command command){
        if(list!=null){
            list.add(command);
        }
    }

    public void executeAll(){
        if(list==null){
            System.out.println("控制器不存在");
        }
        list.stream().forEach(x->x.execute());
    }
}
