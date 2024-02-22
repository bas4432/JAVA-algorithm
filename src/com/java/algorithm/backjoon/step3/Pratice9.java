package com.java.algorithm.backjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pratice9 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for(int i=0 ; i< T; i++){
            sb.append("*");
            System.out.println(sb);
        }
    }
}
