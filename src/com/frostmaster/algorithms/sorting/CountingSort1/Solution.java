package com.frostmaster.algorithms.sorting.CountingSort1;

import java.util.Scanner;

public class Solution {

    static int[] countingSort(int[] arr) {
        int count[] = new int[100];
        for(int i=0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
