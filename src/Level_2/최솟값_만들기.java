package Level_2;

import java.util.*;
import java.util.stream.Collectors;

public class 최솟값_만들기 {

	public static void main(String[] args) {
		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };

		// 목표 answer
		int answer = 29;

		// 확인
		System.out.println(solution(A, B));
		System.out.println(answer == solution(A, B));

	}

	static int solution(int[] A, int[] B) {
		int answer = 0;

		ArrayList<Integer> li_A = new ArrayList<>();
		ArrayList<Integer> li_B = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			li_A.add(A[i]);
			li_B.add(B[i]);
		}

		Collections.sort(li_A);
		Collections.sort(li_B);
		Collections.reverse(li_B);

		for (int i = 0; i < A.length; i++) {
			answer += li_A.get(i) * li_B.get(i);
		}

		return answer;
	}

}
