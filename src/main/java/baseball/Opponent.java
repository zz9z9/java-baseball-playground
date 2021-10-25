package baseball;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Opponent {
    private int answer;

    public void setAnswer() {
        // 1~9로 이루어진 세 자리 수 (각 자리수 마다 다르다)
        List<Integer> li = IntStream.range(1,9).boxed().collect(Collectors.toList());
        String ans = "";

        while(ans.length() < 3) {
            int idx = getNumBetweenRange(0, li.size());
            ans = ans + li.get(idx);
            li.remove(idx);
        }

        this.answer = Integer.parseInt(ans);
//        System.out.println("this.answer :: "+this.answer+"\n\n");
    }

    private int getNumBetweenRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

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
