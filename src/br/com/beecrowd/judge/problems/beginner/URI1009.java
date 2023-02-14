package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1009 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double sellerSalary = Double.parseDouble(in.readLine());
        double soldValue = Double.parseDouble(in.readLine());

        double total = sellerSalary + (soldValue * 0.15f);

        System.out.println(String.format("TOTAL = R$ %.2f", total));
    }
}
