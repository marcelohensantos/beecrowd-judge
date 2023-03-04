package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1074 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());

        int num;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(in.readLine());

            if (num == 0) {
                System.out.println("NULL");
            } else if (num < 0) {
                if (Math.abs(num) % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            } else {
                if (Math.abs(num) % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            }
        }
    }
}
