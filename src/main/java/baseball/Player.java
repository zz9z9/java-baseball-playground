package baseball;

import java.util.Scanner;

public class Player {
    private final Scanner sc = new Scanner(System.in);

    public boolean keepContinue() {
        int continueFlag = sc.nextInt();
        if(continueFlag==1) {
            return true;
        }

        return false;
    }

    public int getPredictNumber() {
        return sc.nextInt();
    }
}
