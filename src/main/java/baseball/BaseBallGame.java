package baseball;

import baseball.view.InputView;
import baseball.view.ResultView;

public class BaseBallGame {
    private Player player;
    private Opponent opponent;

    public BaseBallGame(Player player, Opponent opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        InputView.showKeepContinueMsg();
        while(player.keepContinue()) {
            play();
        }

        stop();
    }

    private void play() {
        opponent.setAnswer();

        int requestNum;
        do {
            InputView.showInputNumberMsg();
            requestNum = player.getPredictNumber();
            String result = opponent.getResult(requestNum);

            ResultView.showResultMsg(result);
        } while(!opponent.isCorrect(requestNum));

        ResultView.showGameDoneMsg();
        InputView.showKeepContinueMsg();
    }

    private void stop() {
        ResultView.showGameEndMsg();
        return;
    }
}
