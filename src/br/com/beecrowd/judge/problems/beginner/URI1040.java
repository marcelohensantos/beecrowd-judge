package br.com.beecrowd.judge.problems.beginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();
        double n4 = in.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.println("Media: " + df.format(media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double exame = in.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));

            media = (media + exame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + df.format(media));
        }
    }
}
