package command;

public class CommandTest {
    public static void main(String[] args) throws Exception {
        //接收者
        MakeFile makeFile = new MakeFile();
        //命令
        CommandCreate create = new CommandCreate(makeFile);
        CommandDelete delete = new CommandDelete(makeFile);
        //请求者
        Client client = new Client();

        //请求者和执行者不再直接关联
        //执行命令
        client.setCommand(create).executeCommand("d://test1.txt");
        client.setCommand(create).executeCommand("d://test2.txt");
        client.setCommand(delete).executeCommand("d://test2.txt");
    }
}