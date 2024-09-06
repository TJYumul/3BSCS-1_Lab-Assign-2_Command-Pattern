public class LightsOn implements Command {
    private Lights light;

    public LightsOn(Lights light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOn();
    }
}