import java.util.*;
public class SetVolume implements Command {
    private MusicPlayer musicPlayer;
    private int volume;

    public SetVolume(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.volume = volume;
    }

    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter volume level (0-100): ");
        int volume = sc.nextInt();
        return MusicPlayer.setVolume(volume);
    }
}