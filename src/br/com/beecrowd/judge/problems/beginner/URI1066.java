package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1066 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            n = Integer.parseInt(in.readLine());

            if (n % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }

            if (n > 0) {
                positivo += 1;
            } else if (n < 0) {
                negativo += 1;
            }
        }

        System.out.printf("%d valor(es) par(es)%n", par);
        System.out.printf("%d valor(es) impar(es)%n", impar);
        System.out.printf("%d valor(es) positivo(s)%n", positivo);
        System.out.printf("%d valor(es) negativo(s)%n", negativo);
    }
}
