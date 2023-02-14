package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1002 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double r = Double.parseDouble(in.readLine());
        double a = 3.14159 * Math.pow(r, 2);

        System.out.println(String.format("A=%.4f", a));
    }
}
