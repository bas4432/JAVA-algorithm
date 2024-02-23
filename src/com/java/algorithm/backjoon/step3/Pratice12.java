package com.java.algorithm.backjoon.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pratice12 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder builder = new StringBuilder();

        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            builder.append((A + B)).append("\n");
        }
        System.out.print(builder);
        br.close();
    }

}
