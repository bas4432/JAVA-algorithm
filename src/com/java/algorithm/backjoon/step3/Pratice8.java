package com.java.algorithm.backjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pratice8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int sum = num1 + num2;

            sb.append("Case #").append(i + 1).append(": ").append(num1).append(" + ").append(num2).append(" = ")
                    .append(sum).append("\n");
        }

        br.readLine();

        System.out.println(sb);
    }
}
