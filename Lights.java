public class Lights {
    public String turnOn() {
        return "Lights on.";
    }

    public String turnOff() {
        return "Lights off.";
    }

    public static String setBrightness(int level) {
        return "Lights brightness set to " + level + "%.";
    }
}