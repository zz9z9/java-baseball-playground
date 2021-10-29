package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    private PlayResult compare(List<Integer> comBalls, List<Integer> userBalls) {
        Balls com = new Balls(comBalls);
        Balls user = new Balls(userBalls);

        return com.play(user);
    }

    @Test
    void play_nothing() {
        PlayResult result = compare(Arrays.asList(1,2,3), Arrays.asList(4,5,6));

        assertThat(result.isNothing()).isTrue();
    }

    @Test
    void play_1strike_1ball() {
        PlayResult result = compare(Arrays.asList(1,2,3), Arrays.asList(1,4,2));

        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void play_game_end() {
        PlayResult result = compare(Arrays.asList(1,2,3), Arrays.asList(1,2,3));

        assertThat(result.isGameEnd()).isTrue();
    }
}
