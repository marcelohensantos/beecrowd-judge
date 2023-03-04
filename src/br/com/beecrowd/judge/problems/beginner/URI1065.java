package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1065 {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int even = 0;
        int value;
        for (int i = 0; i < 5; i++) {
            value = Integer.parseInt(in.readLine());
            if (value % 2 == 0) {
                even += 1;
            }
        }
        
        System.out.printf("%d valores pares%n", even);
    }
}
