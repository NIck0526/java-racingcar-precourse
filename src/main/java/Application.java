import utils.GameManager;
import utils.Message;
import utils.RaceResult;

public class Application {

    private static final GameManager gm = new GameManager();

    public static void main(String[] args) {
        System.out.println(Message.SET_UP.getMessage());
        gm.setUp();
        gm.race();
        gm.raceResult();
    }
}
