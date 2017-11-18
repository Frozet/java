package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FindWay {
    int point;
    int k;
    int numi, numj;
    FindWay (int point, int k, int numi, int numj) {
        this.point = point;
        this.k = k;
        this.numi = numi;
        this.numj = numj;
    }

    public int toCount() {
        int number = 0;
        while (number != point) {
            
            k++;
        }
        return k;
    }
}

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "F://Program Files/data.txt";
        FileInputStream in = new FileInputStream(filename);
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[][] MasSm = new int[N][N];
        int num1;
        int num2;
        for (int i = 0; i < S; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            MasSm[num1 - 1][num2 - 1] = 1;
            MasSm[num2 - 1][num1 - 1] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (MasSm[i][j] == 1) {

                }
                System.out.print(MasSm[i][j] + " ");
            }
            System.out.println();
        }
        int K = sc.nextInt();
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (i == K) {
                System.out.println(i + 1 + " " + 0);
            } else {
                FindWay p = new FindWay(i, k);
                p.toCount();
            }
        }
        /*int k = 0;
        int K = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (i == K - 1) {
                k = 0;
                System.out.println(i + " " + k);
            } else {
                for (int j = 0; j < N; j++) {
                    if (i != K - 1) {
                        if (MasSm[i][j] == 1 && j == K - 1) {
                            k = 1;
                            System.out.println(i + " " + k);
                        } else {

                        }

                    }
                }
            }
            k = 0;
        }*/
    }
}
