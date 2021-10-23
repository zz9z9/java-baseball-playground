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
            if(isStrike(c,i,ans)) { // TODO : 규칙위반(인덴트 2) 하지 않게 어떻게 구현할 수 있을까
                strikeCnt++;
                continue;
            }

            if(isBall(c,i,ans)) {
                ballCnt++;
                continue;
            }
        }

        if(ballCnt==0 && strikeCnt==0) {
            return "낫씽";
        }

        if(ballCnt==0 && strikeCnt>0) {
            return strikeCnt+"스트라이크";
        }

        if(ballCnt>0 && strikeCnt==0) {
            return ballCnt+"볼";
        }

        return ballCnt+"볼 "+strikeCnt+"스트라이크";
    }

    public boolean isCorrect(int requestNum) {
        return requestNum==answer;
    }
}
