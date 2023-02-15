package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1018 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());

        int note100 = n / 100;
        int note50 = (n % 100) / 50;
        int note20 = (n % 100 % 50) / 20;
        int note10 = (n % 100 % 50 % 20) / 10;
        int note5 = (n % 100 % 50 % 20 % 10) / 5;
        int note2 = (n % 100 % 50 % 20 % 10 % 5) / 2;
        int note1 = n % 100 % 50 % 20 % 10 % 5 % 2;

        System.out.println(n);
        System.out.println(String.format("%d nota(s) de R$ 100,00", note100));
        System.out.println(String.format("%d nota(s) de R$ 50,00", note50));
        System.out.println(String.format("%d nota(s) de R$ 20,00", note20));
        System.out.println(String.format("%d nota(s) de R$ 10,00", note10));
        System.out.println(String.format("%d nota(s) de R$ 5,00", note5));
        System.out.println(String.format("%d nota(s) de R$ 2,00", note2));
        System.out.println(String.format("%d nota(s) de R$ 1,00", note1));
    }
}
