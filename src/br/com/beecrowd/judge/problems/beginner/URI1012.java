package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangle = (a * c) / 2.0;
        double circle = 3.14159 * Math.pow(c, 2.0);
        double trapezium = (c * (a + b)) / 2.0;
        double square = Math.pow(b, 2.0);
        double rectangle = a * b;

        System.out.println(String.format("TRIANGULO: %.3f", triangle));
        System.out.println(String.format("CIRCULO: %.3f", circle));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezium));
        System.out.println(String.format("QUADRADO: %.3f", square));
        System.out.println(String.format("RETANGULO: %.3f", rectangle));
    }
}
