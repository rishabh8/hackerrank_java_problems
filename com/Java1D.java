package com;

import java.util.Scanner;

public class Java1D {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(leap, game, 0);
    }

    // public static boolean isSolvable(int leap, int[] game, int i) {
    // if (i > game.length) {
    // return true;
    // } else if (i < 0 || game[i] == 1) {
    // return false;
    // }

    // game[i] = 1;

    // return isSolvable(leap, game, i + leap) ||
    // isSolvable(leap, game, i + 1) ||
    // isSolvable(leap, game, i + );
    // }
    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1)
            return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1)
            return true;

        arr[i] = 1;
        return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
