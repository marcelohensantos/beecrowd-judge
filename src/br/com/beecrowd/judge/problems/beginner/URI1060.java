package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1060 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int positive = 0;
        double value;
        for (int i = 0; i < 6; i++) {
            value = Double.parseDouble(in.readLine());
            if (value > 0) {
                positive += 1;
            }
        }

        System.out.printf("%d valores positivos%n", positive);
    }
}
