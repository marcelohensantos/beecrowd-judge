package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        float total;

        switch (x) {
            case 1:
                total = (float) y * 4.0f;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;

            case 2:
                total = (float) y * 4.5f;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;

            case 3:
                total = (float) y * 5.0f;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;

            case 4:
                total = (float) y * 2.0f;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;

            case 5:
                total = (float) y * 1.5f;
                System.out.println(String.format("Total: R$ %.2f", total));
                break;
        }
    }
}
