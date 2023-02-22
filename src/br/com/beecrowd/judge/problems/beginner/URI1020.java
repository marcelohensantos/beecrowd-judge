package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1020 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int age = Integer.parseInt(in.readLine());

        int ano = age / 365;
        int mes = age % 365 / 30;
        int dia = age % 365 % 30;

        System.out.println(String.format("%d ano(s)", ano));
        System.out.println(String.format("%d mes(es)", mes));
        System.out.println(String.format("%d dia(s)", dia));
    }
}
