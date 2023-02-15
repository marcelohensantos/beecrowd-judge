package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1011 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double r = Double.parseDouble(in.readLine());
        double v = (4.0 / 3) * 3.14159 * Math.pow(r, 3.0);

        System.out.println(String.format("VOLUME = %.3f", v));
    }
}
