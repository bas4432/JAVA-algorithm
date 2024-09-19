package com.java.algorithm.backjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class PraticeArray6 {

    public static void main(String[] args) throws Exception{


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] count = new int[N];
        int M = Integer.parseInt(st.nextToken());
        int temp;

        for(int i = 0; i < count.length; i++) {   // 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
            count[i] = i + 1;                     // 배열의 index 는 0 부터 시작 [0,1,2,3,4,5]
        }

        for(int i =0; i < M; i++){
            st = new StringTokenizer(bufferedReader.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            temp = count[I-1]; // temp = 1 , 3 , 2 , 1
            count[I-1] = count[J-1]; // count[0] = 2  , count[2] = 4 , count[0] = 3 , count[1] = 1
            count[J-1] = temp; //count[1] = 1 // count[3] = 3 // count[3] = 2 , count[1] = 1
        }

        for(int k = 0; k <count.length; k++) {
            bw.write(count[k] + " ");
        }

        bufferedReader.close();
        bw.flush();
        bw.close();

    }
}
