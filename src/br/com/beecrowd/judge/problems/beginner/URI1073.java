package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1073 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());

        for (int i = 2; i <= n; i += 2) {
            System.out.printf("%d^2 = %d%n", i, (long) Math.pow(i, 2));
        }
    }
}
