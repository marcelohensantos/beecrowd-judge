package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1072 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());
        int num;
        int inNum = 0;
        int outNum = 0;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(in.readLine());
            if (num >= 10 && num <= 20) {
                inNum += 1;
            } else {
                outNum += 1;
            }
        }

        System.out.printf("%d in%n", inNum);
        System.out.printf("%d out%n", outNum);
    }
}
