package com.frostmaster.algorithms.SaveThePrisoner;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            //int result = saveThePrisoner(n, m, s);
            System.out.println(((m+s-2)%n)+1);
        }
    }

}
