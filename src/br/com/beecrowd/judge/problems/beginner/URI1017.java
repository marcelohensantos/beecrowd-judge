package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1017 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int time = Integer.parseInt(in.readLine());
        int vel = Integer.parseInt(in.readLine());

        double total = (vel * time) / 12.0;

        System.out.println(String.format("%.3f", total));
    }
}