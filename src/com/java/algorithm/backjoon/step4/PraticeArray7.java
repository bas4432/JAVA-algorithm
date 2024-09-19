package com.java.algorithm.backjoon.step4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PraticeArray7 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] student = new int[31];  // 1~30번 학생이므로 배열 크기는 31

        // 입력된 28명의 학생 번호를 처리
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            student[num]++;  // 해당 학생을 체크
        }

        // 제출하지 않은 학생(0인 인덱스) 출력
        for (int j = 1; j < 31; j++) {
            if (student[j] == 0) {
                System.out.println(j);
            }
        }
    }
}
