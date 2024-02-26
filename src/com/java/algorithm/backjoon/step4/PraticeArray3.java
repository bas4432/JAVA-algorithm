package com.java.algorithm.backjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PraticeArray3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

        for(int i=0; i< N;i++){
           arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0]; //최소값
        int max = arr[0]; //최대값

        for(int j=0;j<arr.length;j++){

            if(max < arr[j]){
               max = arr[j];
            }

            if(min>arr[j]){
               min = arr[j];
            }
        }
        System.out.println(min + " " + max);
        bufferedReader.close();
    }
}
