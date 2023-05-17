package TestLearn.commandPattern;

/**
 * Light command object which knows about receiver(lights)
 * and apis to call on recieving a command
 */
public class LightsOffCommand implements Command{
    Lights lights;
    LightsOffCommand(){
        this.lights=new Lights();
    }

    LightsOffCommand(Lights lights){
        this.lights=lights;
    }

    @Override
    public void execute() {
        lights.off();
    }
}
