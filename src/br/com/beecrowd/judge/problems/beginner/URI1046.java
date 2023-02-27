package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();

        if (start == end) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (start > end) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (end + 24 - start));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", (end - start));
        }
    }
}
