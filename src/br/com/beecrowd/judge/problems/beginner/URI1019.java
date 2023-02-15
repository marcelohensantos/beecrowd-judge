package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1019 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());

        int hour = n / 3600;
        int min = (n % 3600) / 60;
        int sec = (n % 3600) % 60;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}
