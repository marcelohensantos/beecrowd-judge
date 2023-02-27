package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1048 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double salary = Double.parseDouble(in.readLine());

        if (salary <= 400) {
            System.out.printf("Novo salario: %.2f%n", salary * 1.15);
            System.out.printf("Reajuste ganho: %.2f%n", salary * 0.15);
            System.out.println("Em percentual: 15 %");
        } else if (salary > 400 && salary <= 800) {
            System.out.printf("Novo salario: %.2f%n", salary * 1.12);
            System.out.printf("Reajuste ganho: %.2f%n", salary * 0.12);
            System.out.println("Em percentual: 12 %");
        } else if (salary > 800 && salary <= 1200) {
            System.out.printf("Novo salario: %.2f%n", salary * 1.10);
            System.out.printf("Reajuste ganho: %.2f%n", salary * 0.10);
            System.out.println("Em percentual: 10 %");
        } else if (salary > 1200 && salary <= 2000) {
            System.out.printf("Novo salario: %.2f%n", salary * 1.07);
            System.out.printf("Reajuste ganho: %.2f%n", salary * 0.07);
            System.out.println("Em percentual: 7 %");
        } else {
            System.out.printf("Novo salario: %.2f%n", salary * 1.04);
            System.out.printf("Reajuste ganho: %.2f%n", salary * 0.04);
            System.out.println("Em percentual: 4 %");
        }
    }
}
