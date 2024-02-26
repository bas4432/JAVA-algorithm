package com.java.algorithm.backjoon.step4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PraticeArray2 {

    public static void main(String[] args) throws IOException {
    //첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
    //
    //둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
    // 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

    //출력
    //X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

    //예제 입력 1
    //10 5
    //1 10 4 9 2 3 8 5 7 6
    //예제 출력 1
    //1 4 2 3

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int j=0; j<arr.length ; j++){
            if(arr[j] < X){
                sb.append(arr[j]).append(" ");
            }
        }

        System.out.println(sb);
    }
}
