import baseball.BaseBallGame;
import baseball.Opponent;
import baseball.Player;

public class Main {
    public static void main(String[] args) {
        BaseBallGame game = new BaseBallGame(new Player(), new Opponent());
        game.start();
    }
}
