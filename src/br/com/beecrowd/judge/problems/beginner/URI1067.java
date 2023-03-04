package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1067 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int x = Integer.parseInt(in.readLine());

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
