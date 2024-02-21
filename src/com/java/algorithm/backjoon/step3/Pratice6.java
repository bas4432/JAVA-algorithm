package com.java.algorithm.backjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pratice6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bufferedReader.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
        }
        bufferedReader.close();

        System.out.println(sb);
    }
}
