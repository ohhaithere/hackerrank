package com.frostmaster.WeekOfCode38.WhichSection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the whichSection function below.
    static int whichSection(int n, int k, int[] a) {
        int sum = 1;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(k < sum){
                return i + 1;
            }
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nkm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nkm[0]);

            int k = Integer.parseInt(nkm[1]);

            int m = Integer.parseInt(nkm[2]);

            int[] a = new int[m];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < m; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            int result = whichSection(n, k, a);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
