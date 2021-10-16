package baseball;

public class GameManager {
    private Player player = new Player();
    private Opponent opponent = new Opponent();
    private InputView inputView = new InputView();
    private ResultView resultView = new ResultView();

    public void init() {
        inputView.showGameContinueMsg();

        while(player.getContinueFlag()==1) {
            beginGame();
        }

        resultView.showEndMsg();
    }

    public void beginGame() {
        String resultMsg = "";

        while(!"3스트라이크".equals(resultMsg)) {
            inputView.showInputMsg();
            int num = player.getNumber();
            resultMsg = opponent.getResult(num);

            resultView.showResultMsg(resultMsg);
        }
    }
}
