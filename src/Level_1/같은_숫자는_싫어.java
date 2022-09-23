package Level_1;

import java.util.*;

public class 같은_숫자는_싫어 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		// 목표 answer = [1,3,0,1]

		System.out.println(solution(arr).toString());

	}

	static ArrayList solution(int[] arr) {
		int[] answer = {};

		ArrayList li = new ArrayList();

		int tmp = 99;
		for (int i : arr) {
			if (i != tmp) {
				li.add(i);
			}
			tmp = i;
		}

		return li;
	}

}
