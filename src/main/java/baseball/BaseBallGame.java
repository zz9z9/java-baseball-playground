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
        InputView.showGameGuideMsg();
        while(player.keepContinue()) {
            play();
        }

        stop();
    }

    private void play() {
        int requestNum;
        do {
            InputView.showInputNumberMsg();
            requestNum = player.getPredictNumber();
            String result = opponent.getResult(requestNum);

            ResultView.showResultMsg(result);
        } while(!opponent.isCorrect(requestNum));
    }

    private void stop() {
        ResultView.showGameEndMsg();
        return;
    }

//    private boolean isValidNum(int n) {
//        String num = String.valueOf(n);
//
//        if(num.length()!=3 || num.contains("0")) {
//            return false;
//        }
//
//        return true;
//    }
}
