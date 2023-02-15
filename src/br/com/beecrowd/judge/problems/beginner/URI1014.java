package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1014 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int x = Integer.parseInt(in.readLine());
        double y = Double.parseDouble(in.readLine());
        double consumption = x / y;

        System.out.println(String.format("%.3f km/l", consumption));
    }
}
