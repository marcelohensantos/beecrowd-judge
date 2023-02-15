package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1010 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int unit1 = sc.nextInt();
        double price1 = sc.nextDouble();

        int unit2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double total = ((unit1 * price1) + (unit2 * price2));
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
