package com.LeetCode.com;

import java.util.Scanner;

public class MedianOfArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] str = sc.nextLine().split(" ");
            int[] nums1 = new int[str.length];
            for (int i=0;i<nums1.length;i++) {
                nums1[i] = Integer.parseInt(str[i]);
            }

            str = sc.nextLine().split(" ");
            int[] nums2 = new int[str.length];
            for (int i=0;i<nums2.length;i++) {
                nums2[i] = Integer.parseInt(str[i]);
            }

            double res = new MedianOfArray().findMedianSortedArrays(nums1, nums2);
            System.out.println(res);
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 > len2) {
            return findMedian(nums2, nums1);
        } else {
            return findMedian(nums1, nums2);
        }
    }

    public double findMedian(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]) {
                iMin = i + 1;
            } else if(i > iMin && A[i-1] > B[j]) {
                iMax = i-1;
            } else {
                int maxLeft = 0;
                if (i==0) maxLeft = B[j-1];
                else if (j==0) maxLeft = A[i-1];
                else maxLeft = Math.max(A[i-1], B[j-1]);

                if ((m+n) % 2 == 1) return maxLeft;
                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        } 
        return 0.0f;
    }
}
