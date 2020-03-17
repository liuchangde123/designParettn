package designParettn.command;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        List<Command> commands = Arrays.asList(new OnCommand(light), new OffCommand(light));
        new Controller(commands).executeAll();
    }

}
