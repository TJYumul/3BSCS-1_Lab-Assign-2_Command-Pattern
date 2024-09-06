import java.util.*;
public class Brightness implements Command {
    private Lights light;
    private int brightness;

    public Brightness(Lights light) {
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brightness level (0-100): ");
        int brightness = sc.nextInt();
        return Lights.setBrightness(brightness);
    }
}