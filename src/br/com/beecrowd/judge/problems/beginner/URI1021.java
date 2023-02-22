package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1021 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        float n = Float.parseFloat(in.readLine());

        int notes = (int) n;
        int coins = (int) Math.round((n - notes) * 100.0f);

        int note100 = notes / 100;
        int note50 = (notes % 100) / 50;
        int note20 = (notes % 100 % 50) / 20;
        int note10 = (notes % 100 % 50 % 20) / 10;
        int note5 = (notes % 100 % 50 % 20 % 10) / 5;
        int note2 = (notes % 100 % 50 % 20 % 10 % 5) / 2;

        int coin100 = notes % 100 % 50 % 20 % 10 % 5 % 2;
        int coin50 = (coins % 100) / 50;
        int coin25 = (coins % 100 % 50) / 25;
        int coin10 = (coins % 100 % 50 % 25) / 10;
        int coin5 = (coins % 100 % 50 % 25 % 10) / 5;
        int coin1 = coins % 100 % 50 % 20 % 10 % 5;

        System.out.println("NOTAS:");
        System.out.println(String.format("%d nota(s) de R$ 100.00", note100));
        System.out.println(String.format("%d nota(s) de R$ 50.00", note50));
        System.out.println(String.format("%d nota(s) de R$ 20.00", note20));
        System.out.println(String.format("%d nota(s) de R$ 10.00", note10));
        System.out.println(String.format("%d nota(s) de R$ 5.00", note5));
        System.out.println(String.format("%d nota(s) de R$ 2.00", note2));

        System.out.println("MOEDAS:");
        System.out.println(String.format("%d moeda(s) de R$ 1.00", coin100));
        System.out.println(String.format("%d moeda(s) de R$ 0.50", coin50));
        System.out.println(String.format("%d moeda(s) de R$ 0.25", coin25));
        System.out.println(String.format("%d moeda(s) de R$ 0.10", coin10));
        System.out.println(String.format("%d moeda(s) de R$ 0.05", coin5));
        System.out.println(String.format("%d moeda(s) de R$ 0.01", coin1));
    }
}
