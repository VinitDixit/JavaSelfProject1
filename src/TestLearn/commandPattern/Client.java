package TestLearn.commandPattern;

public class Client {
    public static void main(String[] args) {

        //Command Objects
        Command lightsONCommand= new LightsOnCommand();
        Command lightsOffCommand= new LightsOffCommand();

        //Invoker which invokes these commands
        InvokeCommandOnButtonClick onButtonClick= new InvokeCommandOnButtonClick();
        onButtonClick.setCommand(lightsONCommand);
        onButtonClick.buttonClick();

        onButtonClick.setCommand(lightsOffCommand);
        onButtonClick.buttonClick();
    }
}
