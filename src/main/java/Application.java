import utils.GameManager;
import utils.Message;

public class Application {

    private static final GameManager gm = new GameManager();

    public static void main(String[] args) {
        System.out.println(Message.SET_UP.getMessage());
        gm.setUp();
    }
}
