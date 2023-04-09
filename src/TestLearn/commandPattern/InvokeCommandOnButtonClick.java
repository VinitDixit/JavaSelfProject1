package TestLearn.commandPattern;

/**
 * Invoker class/consumer class which invokes the command
 */
public class InvokeCommandOnButtonClick {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonClick(){
        this.command.execute();
    }
}
