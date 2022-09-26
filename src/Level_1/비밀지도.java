package Level_1;

import java.util.*;

public class 비밀지도 {

	public static void main(String[] args) {

		int n = 5;

		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		// 목표 출력 = ["#####","# # #", "### #", "# ##", "#####"]

		System.out.println(Arrays.toString(solution(n, arr1, arr2)));

	}

	static String[] solution(int n, int[] arr1, int[] arr2) {

		String[] answer = new String[n];

		String[] bin_li1 = new String[n];
		String[] bin_li2 = new String[n];

		for (int i = 0; i < n; i++) {
			bin_li1[i] = Integer.toBinaryString(arr1[i]);
			bin_li2[i] = Integer.toBinaryString(arr2[i]);

		}

		for (int i = 0; i < n; i++) {

			while (bin_li1[i].length() != n) {
				bin_li1[i] = "0" + bin_li1[i];
			}

		}

		for (int i = 0; i < n; i++) {

			while (bin_li2[i].length() != n) {
				bin_li2[i] = "0" + bin_li2[i];
			}

		}

		for (int i = 0; i < n; i++) {
			String tmp = "";
			for (int j = 0; j < n; j++) {
				if ((bin_li1[i].charAt(j) == '1') || bin_li2[i].charAt(j) == '1') {
					tmp += "#";
				} else {
					tmp += " ";
				}
			}
			answer[i] = tmp;
		}

		return answer;
	}

}
