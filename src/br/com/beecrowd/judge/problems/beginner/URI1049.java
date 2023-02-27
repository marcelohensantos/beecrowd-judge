package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1049 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String classA = in.readLine();
        String classB = in.readLine();
        String classC = in.readLine();

        if (classA.equals("vertebrado")) {
            if (classB.equals("ave")) {
                if (classC.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (classC.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (classB.equals("mamifero")) {
                if (classC.equals("onivoro")) {
                    System.out.println("homem");
                } else if (classC.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (classA.equals("invertebrado")) {
            if (classB.equals("inseto")) {
                if (classC.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (classC.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (classB.equals("anelideo")) {
                if (classC.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (classC.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
