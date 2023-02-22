package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if ((a < b + c) && (a < b + c) && (b < a + c)) {
            double perimetro = a + b + c;
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else {
            double area = ((a + b) * c) / 2;
            System.out.println(String.format("Area = %.1f", area));
        }
    }
}
