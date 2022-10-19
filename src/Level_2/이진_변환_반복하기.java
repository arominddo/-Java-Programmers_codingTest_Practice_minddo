package Level_2;

import java.util.*;

public class 이진_변환_반복하기 {

	public static void main(String[] args) {

		String s = "110010101001";

		// 목표 result
		int[] result = { 3, 8 };

		// 확인
		System.out.println(Arrays.toString(solution(s)));
	}

	static int[] solution(String s) {
		int[] answer = new int[2];

		int re_cnt = 0;
		int play_cnt = 0;

		while (!s.equals("1")) {
			play_cnt += 1;

			long temp = s.chars().filter(ch -> ch == '0').count();

			re_cnt += (int) temp;

			s = Integer.toBinaryString(s.length() - (int) temp);

		}

		answer[0] = play_cnt;
		answer[1] = re_cnt;

		return answer;
	}

}
