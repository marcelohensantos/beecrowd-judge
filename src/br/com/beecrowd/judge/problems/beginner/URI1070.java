package br.com.beecrowd.judge.problems.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1070 {
    
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int x = Integer.parseInt(in.readLine());
        
        x = (x % 2 == 0) ? x+1 : x;
        
        for (int i = 0; i < 6; i++, x+=2) {
            System.out.println(x);
        }        
    }
}
