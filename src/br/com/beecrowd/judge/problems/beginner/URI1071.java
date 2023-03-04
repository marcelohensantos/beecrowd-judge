package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1071 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int x = Integer.parseInt(in.readLine());
        int y = Integer.parseInt(in.readLine());
        int odd = 0;
        for (int i = Math.min(x, y) + 1; i < Math.max(x, y); i++) {
            if (Math.abs(i) % 2 == 1) {
                odd += i;
            }
        }

        System.out.println(odd);
    }
}
