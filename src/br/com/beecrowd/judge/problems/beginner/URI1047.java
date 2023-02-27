package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int startHour = in.nextInt();
        int startMin = in.nextInt();
        int endHour = in.nextInt();
        int endMin = in.nextInt();

        int gameHour;
        int gameMin;

        if ((startHour == endHour) && (startMin == endMin)) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            if (startMin > endMin) {
                startHour += 1;
                gameMin = (endMin + 60) - startMin;
            } else {
                gameMin = endMin - startMin;
            }

            if (startHour > endHour) {
                gameHour = (endHour + 24) - startHour;
            } else {
                gameHour = endHour - startHour;
            }

            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", gameHour, gameMin);
        }
    }
}
