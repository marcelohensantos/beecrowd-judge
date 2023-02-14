package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1006 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double a = Double.parseDouble(in.readLine());
        double b = Double.parseDouble(in.readLine());
        double c = Double.parseDouble(in.readLine());

        double media = ((a * 2.0f) + (b * 3.0f) + (c * 5.0f)) / 10.0f;

        System.out.println(String.format("MEDIA = %.1f", media));
    }
}
