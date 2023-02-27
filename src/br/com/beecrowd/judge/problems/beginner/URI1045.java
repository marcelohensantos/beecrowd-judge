package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double swap;

        if (!(a > b)) {
            swap = a;
            a = b;
            b = swap;

        }
        if (a <= c) {
            swap = a;
            a = c;
            c = swap;
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            double aux = Math.pow(b, 2) + Math.pow(c, 2);
            if (Math.pow(a, 2) == aux) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (Math.pow(a, 2) > aux) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (Math.pow(a, 2) < aux) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && a == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
