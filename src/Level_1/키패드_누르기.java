package Level_1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 키패드_누르기 {

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

//		목표 result = "LRLLLRLLRRL"
		String target = "LRLLLRLLRRL";

		System.out.println("내 정답은 : " + solution(numbers, hand));
		System.out.println("정답? : " + solution(numbers, hand).equals(target));

	}

	static String solution(int[] numbers, String hand) {

		String answer = "";

		int[] tmp_l = { 99, 7, 4, 1 };
		List<Integer> left = Arrays.stream(tmp_l).boxed().collect(Collectors.toList());

		int[] tmp_m = { 0, 8, 5, 2 };
		List<Integer> midle = Arrays.stream(tmp_m).boxed().collect(Collectors.toList());

		int[] tmp_r = { 99, 9, 6, 3 };
		List<Integer> right = Arrays.stream(tmp_r).boxed().collect(Collectors.toList());

		int[] LP = { 0, 0 };
		int[] RP = { 0, 0 };

		int l_far = 0;
		int r_far = 0;

		for (int i : numbers) {
			if (left.contains(i)) {
				answer += "L";
				LP[0] = 0;
				LP[1] = left.indexOf(i);
			} else if (right.contains(i)) {
				answer += "R";
				RP[0] = 0;
				RP[1] = right.indexOf(i);
			} else {
				l_far = Math.abs(LP[0] - 1) + Math.abs(midle.indexOf(i) - LP[1]);
				r_far = Math.abs(RP[0] - 1) + Math.abs(midle.indexOf(i) - RP[1]);

				if (l_far == r_far) {
					if (hand.equals("right")) {
						answer += "R";
						RP[0] = 1;
						RP[1] = midle.indexOf(i);
					} else {
						answer += "L";
						LP[0] = 1;
						LP[1] = midle.indexOf(i);
					}
				} else if (l_far < r_far) {
					answer += "L";
					LP[0] = 1;
					LP[1] = midle.indexOf(i);
				} else {
					answer += "R";
					RP[0] = 1;
					RP[1] = midle.indexOf(i);

				}

			}
		}

		return answer;
	}

}
