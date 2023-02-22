package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1037 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        float num = Float.parseFloat(in.readLine());

        if ((num < 0) || (num > 100)) {
            System.out.println("Fora de intervalo");
        } else if (num <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if ((num > 25) && (num <= 50)) {
            System.out.println("Intervalo (25,50]");
        } else if ((num > 50) && (num <= 75)) {
            System.out.println("Intervalo (50,75]");
        } else if ((num > 75) && (num <= 100)) {
            System.out.println("Intervalo (75,100]");
        }
    }
}
