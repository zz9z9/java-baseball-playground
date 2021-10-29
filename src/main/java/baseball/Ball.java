package baseball;

import java.util.List;
import java.util.Objects;

public class Ball {
    private final int num;
    private final int idx;

    public Ball(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }

    private int getNum() {
        return this.num;
    }

    private int getIdx() {
        return this.idx;
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)) {
            return BallStatus.STRIKE;
        }

        if(ball.getNum()==this.getNum() && ball.getIdx()!=this.getIdx()) {
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    public BallStatus play(List<Integer> answer) {
        boolean isExist = answer.contains(this.getNum());
        if(!isExist) {
            return BallStatus.NOTHING;
        }

        int idxNum = answer.get(this.getIdx());
        if(isExist && idxNum != this.getNum()) {
            return BallStatus.BALL;
        }

        return BallStatus.STRIKE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return num == ball.num &&
                idx == ball.idx;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, idx);
    }
}
