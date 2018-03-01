package command;

public class Client {

    Command command;

    public Client setCommand(Command command) {
        this.command = command;
        //返回自身,以供链式调用
        return this;
    }

    public void executeCommand(String name) throws Exception {
        if (command == null)
            throw new Exception("命令不能为空！");
        command.execute(name);
    }
}
