package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1051 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double taxes = 0.0f;

        double salary = Double.parseDouble(in.readLine());

        if (salary > 4500) {
            salary -= 4500;
            taxes += 1000 * 0.08;
            taxes += 1500 * 0.18;
            taxes += salary * 0.28;

            System.out.printf("R$ %.2f%n", taxes);
        } else if (salary > 3000) {
            salary -= 3000;
            taxes += 1000 * 0.08;
            taxes += salary * 0.18;

            System.out.printf("R$ %.2f%n", taxes);
        } else if (salary > 2000) {
            salary -= 2000;
            taxes += salary * 0.08;

            System.out.printf("R$ %.2f%n", taxes);
        } else {
            System.out.println("Isento");
        }
    }
}