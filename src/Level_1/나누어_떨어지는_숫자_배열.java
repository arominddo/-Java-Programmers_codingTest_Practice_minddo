package Level_1;

import java.util.*;

public class 나누어_떨어지는_숫자_배열 {

	public static void main(String[] args) {

		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		// 목표 return = [5, 10]

		System.out.println(Arrays.toString(solution(arr, divisor)));

	}

	static public Object[] solution(int[] arr, int divisor) {

		Vector num_li = new Vector<>();

		for (int i : arr) {
			if (i % divisor == 0) {
				num_li.add(i);
			}
		} // for문

		if (num_li.size() == 0) {
			num_li.add(-1);
		}

		Object[] answer = num_li.toArray();
		Arrays.sort(answer);

		return answer;
	}

}