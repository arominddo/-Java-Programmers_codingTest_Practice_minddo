package Level_1;

import java.util.*;

public class 소수_만들기 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };

		// 목표 result = 1

		System.out.println(solution(nums));

	}

	static int solution(int[] nums) {
		int answer = 0;

		ArrayList<Integer> li = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int h = j + 1; h < nums.length; h++) {
					li.add(nums[i] + nums[j] + nums[h]);
				}
			}
		}

		for (int i : li) {
			boolean ch = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					ch = false;
					break;
				}
				ch = true;
			}
			if (ch) {
				answer++;
			}
		}

		return answer;
	}

}
