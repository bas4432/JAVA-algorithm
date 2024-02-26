package com.java.algorithm.backjoon.step4;

import java.io.*;
import java.util.StringTokenizer;

public class PraticeArray1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");

        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(bufferedReader.readLine());

        for(int j =0; j< arr.length; j++){
            if(v == arr[j]){
               count++;
            }
        }
        System.out.println(count);

        bufferedReader.close();
    }

}
