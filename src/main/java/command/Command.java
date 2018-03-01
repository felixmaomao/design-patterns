package command;


//命令模式的核心 在于 隔绝调用者和执行者，也就是不让调用者直接引用执行者去如何如何。。而是通过中间命令对象来(存储执行者的引用)下命令，进而执行。
//坏处在于会多出来很多命令相关的对象
public interface Command {
    void execute(String name) throws Exception;
}
