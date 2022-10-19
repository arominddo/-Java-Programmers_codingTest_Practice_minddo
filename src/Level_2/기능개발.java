package Level_2;

import java.util.*;

public class 기능개발 {

	public static void main(String[] args) {

		int[] progresses = {93, 30, 55};
//		int[] progresses = { 95, 90, 99, 99, 80, 99 };

		int[] speeds = {1,30,5};
//		int[] speeds = { 1, 1, 1, 1, 1, 1 };

		// 목표 result
		int[] result = { 2, 1 };

		// 확인
		System.out.println(Arrays.toString(solution(progresses, speeds)));
		System.out.println("답안 : " + Arrays.toString(result));

	}

	static int[] solution(int[] progresses, int[] speeds) {

		int cnt = 0;

		ArrayList<Integer> check = new ArrayList<>();

		HashMap<Integer, Integer> temp = new HashMap<>();

		for (int i = 0; i < progresses.length; i++) {
			check.add(0);
		}

		while (true) {

			cnt += 1;
			for (int i = 0; i < progresses.length; i++) {
				if (progresses[i] < 100) {
					progresses[i] += speeds[i];
				}
				if ((progresses[0] >= 100) && (check.get(0) == 0)) {
					check.set(0, cnt);
				}
				if ((i != 0) && (progresses[i] >= 100) && (check.get(i) == 0) && (check.get(i - 1) != 0)) {
					check.set(i, cnt);
				}
			}
			if (check.contains(0)) {
				continue;
			} else {
				break;
			}
		}
		for (int i : check) {
			if (!temp.containsKey(i)) {
				temp.put(i, 1);
			} else {
				temp.put(i, temp.get(i) + 1);
			}
		}

		int[] answer = new int[temp.values().size()];

		ArrayList<Integer> key_li = new ArrayList<>(temp.keySet());
		key_li.sort((s1, s2) -> s1.compareTo(s2));

		int idx = 0;
		for (int key : key_li) {
			answer[idx] = temp.get(key);
			idx++;
		}

		return answer;
	}

}
