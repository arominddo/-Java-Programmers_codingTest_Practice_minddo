package Level_1;

import java.util.*;

public class 실패율 {

	public static void main(String[] args) {

		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		// 목표 result = [3,4,2,1,5]

		System.out.println(Arrays.toString(solution(N, stages)));

	}

	static int[] solution(int N, int[] stages) {

		int num = 0;

		Arrays.sort(stages);

		if (stages[stages.length - 1] >= N) {
			num = stages[stages.length - 1];
		} else {
			num = N;
		}

		int[] stop_li = new int[num];

		for (int i : stages) {
			stop_li[i - 1] += 1;
		}

		HashMap<Integer, Double> tmp = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int[] tmp_li = Arrays.copyOfRange(stop_li, i, stop_li.length);
			int sum = Arrays.stream(tmp_li).sum();
			if (sum == 0) {
				tmp.put((i + 1), 0.0);
			} else {
				tmp.put((i + 1), ((double) stop_li[i] / sum));
			}
		}

		ArrayList<Integer> li = new ArrayList(tmp.keySet());

		Collections.sort(li, (o1, o2) -> Double.compare(tmp.get(o2), tmp.get(o1)));

		int[] answer = li.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
