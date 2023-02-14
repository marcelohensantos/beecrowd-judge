package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1008 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int number = Integer.parseInt(in.readLine());
        int workedHour = Integer.parseInt(in.readLine());
        double hourPrice = Double.parseDouble(in.readLine());

        double salary = hourPrice * workedHour;

        System.out.println(String.format("NUMBER = %d", number));
        System.out.println(String.format("SALARY = U$ %.2f", salary));
    }
}
