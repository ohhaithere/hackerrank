package com.frostmaster.algorithms.ElectronicsShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    static int getMoneySpent(Integer[] keyboards, int[] drives, int s){

        Arrays.sort(keyboards, Collections.reverseOrder());

        Arrays.sort(drives);

        int max = -1;
        for(int i = 0, j = 0; i < keyboards.length; i++){
            for(; j < drives.length; j++){
                if(keyboards[i]+drives[j] > s) break; //This prevents j from incrementing
                if(keyboards[i]+drives[j] > max)
                    max = keyboards[i]+drives[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(Integer keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }

}
