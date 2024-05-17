package HW11_B11209017;

import java.util.Arrays;
import java.util.Scanner;

public class HW11_02 {
	static int getSum(int a) {
		int sum = 0;
		while (a > 0) {
			sum = sum + (a % 10);
			a /= 10;
		}
		return sum;
	}

	static int[] sumToArr(int arrResult[], int arr[]) {// Result = sum
		int[] ans = new int[arrResult.length];
		int[] visited = new int[arrResult.length];
		int[] tag = new int[arrResult.length];
		int[] temp = new int[arrResult.length];

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans.length; j++) {
				if (arrResult[i] == getSum(arr[j]) && (visited[i] == 0)) {
					ans[i] = arr[j];
					visited[i] = 1;
					arr[j] = -1;
				}
			}
		}

		for (int i = 0; i < ans.length-1; i++) {
			if (arrResult[i] == arrResult[i + 1]) {
				tag[i]++;
				tag[i + 1]++;
			}
		}
		for (int i = 0; i < ans.length; i++) {
			if (tag[i] > 0) {
				temp[i] = ans[i];
			}
		}
		Arrays.sort(temp);

		for (int i = 0; i < temp.length; i++) {

			if (temp[i] != 0) {
				ans[i] = temp[i];
			}

		}

		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arrResult = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrResult[i] = getSum(arr[i]);
		}
		Arrays.sort(arrResult);
		int ans[] = sumToArr(arrResult, arr);

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
