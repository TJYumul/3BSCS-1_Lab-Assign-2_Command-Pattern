import java.util.*;
public class CentralHub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoteControl rc = new RemoteControl();

        Tv tv = new Tv();
        Lights lights = new Lights();
        MusicPlayer music = new MusicPlayer();
        Thermostat therm = new Thermostat();

        while (true) {
            System.out.println("Smart Home Control Panel:");
            System.out.println("1. Turn TV On");
            System.out.println("2. Turn TV Off");
            System.out.println("3. Switch Lights On");
            System.out.println("4. Switch Lights Off");
            System.out.println("5. Set Lights Brightness");
            System.out.println("6. Turn Sound System On");
            System.out.println("7. Turn Sound System Off");
            System.out.println("8. Set Sound System Volume");
            System.out.println("9. Increase Thermostat Temperature");
            System.out.println("10. Decrease Thermostat Temperature");
            System.out.print("Select an option (or press 0 to exit): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Smart Home Control. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    rc.setCommand(new TurnOn(tv));
                    break;
                case 2:
                    rc.setCommand(new TurnOff(tv));
                    break;
                case 3:
                    rc.setCommand(new LightsOn(lights));
                    break;
                case 4:
                    rc.setCommand(new LightsOff(lights));
                    break;
                case 5:
                    rc.setCommand(new Brightness(lights));
                    break;
                case 6:
                    rc.setCommand(new PlayMusic(music));
                    break;
                case 7:
                    rc.setCommand(new StopMusic(music));
                    break;
                case 8:
                    rc.setCommand(new SetVolume(music));
                    break;
                case 9:
                    rc.setCommand(new IncreaseTemp(therm));
                    break;
                case 10:
                    rc.setCommand(new DecreaseTemp(therm));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println(rc.clickButton());
            System.out.println(); 
        }

        sc.close();
    }
}