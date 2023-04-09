package TestLearn.commandPattern;

/**
 * Light command object which knows about receiver(lights)
 * and apis to call on recieving a command
 */
public class LightsOnCommand implements Command{
    Lights lights;

    LightsOnCommand(){
        this.lights=new Lights();
    }

    LightsOnCommand(Lights lights){
        this.lights=lights;
    }

    @Override
    public void execute() {
        lights.on();
    }
}
