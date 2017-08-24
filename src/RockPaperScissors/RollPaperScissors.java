package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-24.
 */
public class RollPaperScissors {

    public enum decisionEnum {ROLL, PAPER, SCISSORS}
    public enum gameStats {WYGRANA, PRZEGRANA, REMIS}

    public static void main(String[] args) {

        decisionEnum playerDecision;
        decisionEnum compDecision;
        Scanner sc = new Scanner(System.in);
        String userDecision = sc.nextLine();

        if (userDecision.equals("n")) {
            playerDecision = decisionEnum.SCISSORS;
        }
        if (userDecision.equals("p")) {
            playerDecision = decisionEnum.PAPER;
        }
        if (userDecision.equals("k")) {
            playerDecision = decisionEnum.ROLL;
        }

        Random rand = new Random();
        int compDec = rand.nextInt(3);
        if (compDec == 0) {
            compDecision = decisionEnum.SCISSORS;
        }
        if (compDec == 1) {
            compDecision = decisionEnum.PAPER;
        }
        if (compDec == 2) {
            compDecision = decisionEnum.ROLL;
        }

    }
//    public boolean amIWin(decisionEnum playerEnum, decisionEnum compEnum){
//        if(playerEnum.equals(decisionEnum.ROLL) && compEnum.equals(decisionEnum.ROLL))
//            return gameStats.REMIS
//    }

}
