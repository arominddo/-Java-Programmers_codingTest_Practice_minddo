package Level_1;

import java.util.*;

public class 두_개_뽑아서_더하기 {

	public static void main(String[] args) {

		int[] numbers = { 2, 1, 3, 4, 1 };
		// 목표 result = [2,3,4,5,6,7]

		System.out.println(Arrays.toString(solution(numbers)));

	}

	static int[] solution(int[] numbers) {

		ArrayList<Integer> li = new ArrayList<>();

		for (int i = 0; i < (numbers.length - 1); i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int tmp = numbers[i] + numbers[j];
				if (li.contains(tmp) == false) {
					li.add(tmp);
				}
			}
		}

		li.sort(null);

		int[] answer = li.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
