package baseball;

public class Ball {
    private final int num;
    private int idx;

    public Ball(int num) {
        this.num = num;
    }

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
        if(ball.getNum()!=this.getNum()) {
            return BallStatus.NOTHING;
        }

        if(ball.getNum()==this.getNum() && ball.getIdx()!=this.getIdx()) {
            return BallStatus.BALL;
        }

        return BallStatus.STRIKE;
    }
}
