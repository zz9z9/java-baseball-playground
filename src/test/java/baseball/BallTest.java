package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    @DisplayName("숫자가 일치하지 않는 경우 낫싱")
    void play_nothing() {
        Ball com = new Ball(1);
        Ball user = new Ball(2);

        assertThat(com.play(user)).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    @DisplayName("숫자는 있지만 위치가 다른 경우 볼")
    void play_ball() {
        Ball com = new Ball(1, 0);
        Ball user = new Ball(1, 1);

        assertThat(com.play(user)).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("숫자, 위치 일치하면 스트라이크")
    void play_strike() {
        Ball com = new Ball(1, 1);
        Ball user = new Ball(1, 1);

        assertThat(com.play(user)).isEqualTo(BallStatus.STRIKE);
    }

}
