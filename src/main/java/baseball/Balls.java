package baseball;

import java.util.List;

public class Balls {

    private final List<Integer> answer;

    public Balls(List<Integer> answer) {
        this.answer = answer;
    }

    public List<Integer> getAnswer() {
        return answer;
    }

    public PlayResult play(Balls userBalls) {
        PlayResult result = new PlayResult();
        for(int i=0; i<3; i++) {
            Ball userBall = new Ball(userBalls.getAnswer().get(i), i);
            result.record(userBall.play(this.answer));
        }

        return result;
    }
}
