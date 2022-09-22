package Level_1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 없는_숫자_더하기 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		// 목표 result = 14;

		System.out.println(solution(numbers));
	}

	static int solution(int[] numbers) {
		int answer = 0;

		int N = 45;

		int sum = 0;

		for (int i : numbers) {
			sum += i;
		}

		answer = N - sum;

		return answer;
	}

}
