package com.java.algorithm.backjoon.step4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PraticeArray5{

    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," "); //공백 기준

        int N = Integer.parseInt(st.nextToken());
        int[] count = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M ; i++){
            st = new StringTokenizer(bufferedReader.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int j = I-1; j < J; j++ ){
                count[j] = k;
            }
        }

        for(int k=0; k< N; k++){
            System.out.print(count[k] +" ");
        }
    }
}
