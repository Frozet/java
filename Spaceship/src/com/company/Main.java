package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "F:/Program Files/data.txt";
        FileInputStream in = new FileInputStream(filename);
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] Fi = new int[n];
        int sum = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            Fi[i] = sc.nextInt();
            sum = sum + Fi[i];
        }
        for (int i = 0; i < n; i++) {
            if (sum - Fi[i] == Fi[i]) {
                a = Fi[n - 1];
                Fi[n - 1] = Fi[i];
                Fi[i] = a;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Fi[i]);
        }
    }
}
