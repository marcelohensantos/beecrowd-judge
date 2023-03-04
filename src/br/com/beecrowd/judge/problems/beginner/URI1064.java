package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1064 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double d;
        double avg;
        int pos = 0;
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            d = Double.parseDouble(in.readLine());

            if (d >= 0) {
                pos += 1;
                sum += d;
            }
        }

        avg = sum / (double) pos;

        System.out.printf("%d valores positivos%n", pos);
        System.out.printf("%.1f%n", avg);
    }
}
