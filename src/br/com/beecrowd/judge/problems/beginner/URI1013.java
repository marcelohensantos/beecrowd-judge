package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println(String.format("%d eh o maior", a));
        } else if (b > c) {
            System.out.println(String.format("%d eh o maior", b));
        } else {
            System.out.println(String.format("%d eh o maior", c));
        }
    }
}
