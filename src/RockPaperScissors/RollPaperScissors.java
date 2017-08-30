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
        Scanner sc = new Scanner(System.in);

        decisionEnum playerDecision = decisionEnum.PAPER;
        decisionEnum compDecision = decisionEnum.PAPER;
        String userDecision = sc.nextLine();

        int remisy = 0;
        int zwyciestwa = 0;
        int porazki = 0;
        int liczbaGier = 0;

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

//        gameStats result = (compDecision,);
//
//        if(result.equals(gameStats.REMIS))
//            remisy++;
//        else if(result.equals(gameStats.WYGRANA))
//            zwyciestwa++;
//        else
//            porazki++;
//
//        liczbaGier++;
    }
}
