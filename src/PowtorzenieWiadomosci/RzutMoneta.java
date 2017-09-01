package PowtorzenieWiadomosci;

import java.util.Random;
import java.util.Scanner;

public class RzutMoneta {
    public enum GameMoves{ORZEL, RESZKA, Q}
    public enum GameStats{WYGRANA, PRZEGRANA}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameMoves playerBet = GameMoves.ORZEL;
        GameMoves cpuRand = GameMoves.ORZEL;

        int zwyciestwa = 0;
        int porazki = 0;
        int liczbaGier = 0;

        while (!playerBet.equals(GameMoves.Q)) {
            System.out.printf("Podaj swój zakład:");
            String decision = sc.nextLine();
            switch (decision.toLowerCase()){
                case "o":
                    playerBet = GameMoves.ORZEL;
                    break;
                case "r":
                    playerBet = GameMoves.RESZKA;
                    break;
                case "q":
                    playerBet = GameMoves.Q;
                    break;
                default:
                    continue;
            }

            Random rand = new Random();

            switch (rand.nextInt(2)){
                case 0:
                    cpuRand = GameMoves.ORZEL;
                    System.out.printf("Komputer wylosował Orła\n");
                    break;
                case 1:
                    cpuRand = GameMoves.RESZKA;
                    System.out.printf("Komputer wylosował Reszkę\n");
                    break;
            }

            GameStats result = amIWin(playerBet, cpuRand);

            if(result.equals(GameStats.WYGRANA)) {
                zwyciestwa++;
                liczbaGier++;
            }
            else {
                porazki++;
                liczbaGier++;
            }
        }
        System.out.printf("Zagrałeś %d gier. Wygrałeś: %d razy (%f). Przegrałeś: %d (%f)",
                liczbaGier, zwyciestwa, (double)zwyciestwa/liczbaGier*100, porazki, (double)porazki/liczbaGier*100);

    }

    public static GameStats amIWin(GameMoves playerMove, GameMoves cpuMove){
        if(playerMove.equals(GameMoves.ORZEL) &&
                cpuMove.equals(GameMoves.ORZEL))
            return GameStats.WYGRANA;

        if(playerMove.equals(GameMoves.RESZKA) &&
                cpuMove.equals(GameMoves.RESZKA))
            return GameStats.WYGRANA;


        return GameStats.PRZEGRANA;
    }
}
