public class IncreaseTemp implements Command {
    private Thermostat thermostat;

    public IncreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.increaseTemperature();
    }
}