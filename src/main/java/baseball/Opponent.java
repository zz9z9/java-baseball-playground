package baseball;

public class Opponent {
    private final int answer = 123;

    private boolean isStrike(char num, int index, String ans) {
        if(ans.charAt(index) == num) {
            return true;
        }

        return false;
    }

    private boolean isBall(char num, int index, String ans) {
        if(ans.contains(String.valueOf(num)) && ans.charAt(index)!=num) {
            return true;
        }

        return false;
    }

    public String getResult(int num) {
        int ballCnt = 0;
        int strikeCnt = 0;

        String input = String.valueOf(num);
        String ans = String.valueOf(answer);

        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);

        }
    }

    public boolean isCorrect(int requestNum) {
        return requestNum==answer;
    }
}
