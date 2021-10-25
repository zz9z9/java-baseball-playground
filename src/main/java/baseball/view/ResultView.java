package baseball.view;

public class ResultView {
    public static void showResultMsg(String msg) {
        System.out.println(msg+"\n");
    }

    public static void showGameDoneMsg() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void showGameEndMsg() {
        System.out.println("게임을 종료합니다...");
    }

    public static void showImpossibleMsg() {
        System.out.println("숫자는 1~9로 이루어진 세 자리 수만 가능합니다.");
    }
}
