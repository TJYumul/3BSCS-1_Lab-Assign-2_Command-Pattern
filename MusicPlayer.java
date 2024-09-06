public class MusicPlayer {
    public String play() {
        return "Music is now playing.";
    }
    public String stop() {
        return "Music is stopped.";
    }
    public static String setVolume(int level) {
        return "Music volume set to " + level + "%.";
    }
}