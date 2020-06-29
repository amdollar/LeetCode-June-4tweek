package com.leetcode.week5;

public class UniquePaths {

	public static void main(String[] args) {
		int m = 7;
		int n = 3;
		System.out.println(uniquePaths(m, n));
	}

	public static int uniquePaths(int m, int n) {
		int[][] dp = new int[n][m];
		for (int i = 0; i < m; i++) { // making all the last row to 1 because from there we can move to left only.
			dp[n - 1][i] = 1;
		}
		for (int i = 0; i < n; i++) {
			dp[i][m - 1] = 1;
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = m - 2; j >= 0; j--) {
				dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
			}
		}

		return dp[0][0];
	}
}
