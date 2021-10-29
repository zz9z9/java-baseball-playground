package baseball;

import java.util.Objects;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public PlayResult() {
    }

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public boolean isNothing() {
        return getStrike()==0 && getBall()==0;
    }

    private void increaseStrike() {
        this.strike++;
    }

    private void increaseBall() {
        this.ball++;
    }

    public void record(BallStatus status) {
        if(status.isBall()) {
            increaseBall();
        }

        if(status.isStrike()) {
            increaseStrike();
        }
    }

    public boolean isGameEnd() {
        return getStrike()==3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayResult that = (PlayResult) o;
        return strike == that.strike &&
                ball == that.ball;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strike, ball);
    }
}
