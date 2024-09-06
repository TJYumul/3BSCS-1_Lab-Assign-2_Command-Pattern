public class DecreaseTemp implements Command {
    private Thermostat thermostat;

    public DecreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.decreaseTemperature();
    }
}