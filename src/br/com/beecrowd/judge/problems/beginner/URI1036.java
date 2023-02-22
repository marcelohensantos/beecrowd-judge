package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);

        if ((delta < 0) || (a == 0)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.println(String.format("R1 = %.5f", r1));
            System.out.println(String.format("R2 = %.5f", r2));
        }
    }
}
