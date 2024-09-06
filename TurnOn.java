public class TurnOn implements Command {

    private Tv tv;
    public TurnOn(Tv tv){
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.switchOn();
    }

}