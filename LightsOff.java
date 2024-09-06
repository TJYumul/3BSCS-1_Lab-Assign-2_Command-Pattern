public class LightsOff implements Command {
    private Lights light;

    public LightsOff(Lights light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOff();
    }
}
