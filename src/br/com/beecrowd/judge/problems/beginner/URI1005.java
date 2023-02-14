package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1005 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double a = Double.parseDouble(in.readLine());
        double b = Double.parseDouble(in.readLine());

        double media = ((3.5f * a) + (7.5 * b)) / (3.5f + 7.5f);

        System.out.println(String.format("MEDIA = %.5f", media));
    }
}
