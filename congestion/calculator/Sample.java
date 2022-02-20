// Intger array = {1,3,2,5,4,3,1}
// int value = 2
package congestion.calculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();
            int[] arr = { 1, 3, 2, 5, 4, 3, 1 };
            findDistictPair(arr, arr.length, value);
        }
    }

    public static void findDistictPair(int arr[], int n, int value) {
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] - arr[j] == value || arr[j] - arr[i] == value) {
        //             System.out.println(arr[i] + " " + arr[i + 1]);
        //         }
        //     }
        // }

        Arrays.sort(arr);

        Set<Integer> distset = new HashSet<>();
        for(int i=0;i<n;i++) {
            while(i+1 < n && arr[i] == arr[i+1]) {
                i++;
            }
            if(distset.contains(arr[i] - value)) {
                System.out.println(arr[i] + " " + (arr[i]-value));
            }

            if(distset.contains(arr[i] + value)) {
                System.out.println((arr[i] + value) + " " + (arr[i]));
            }
            distset.add(arr[i]);
        }
    }
}
