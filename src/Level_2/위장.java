package Level_2;

import java.util.*;

public class 위장 {

	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		// 목표 result
		int result = 5;

		// 확인
		System.out.println(solution(clothes));
		System.out.println(solution(clothes) == result);

	}

	static int solution(String[][] clothes) {
		int answer = 0;

		HashMap<String, Integer> dic = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			dic.put(clothes[i][1], 0);
		}

		for (int i = 0; i < clothes.length; i++) {
			dic.put(clothes[i][1], dic.get(clothes[i][1]) + 1);
		}

		answer = 1;

		ArrayList<Integer> val_li = new ArrayList<>(dic.values());

		for (int i = 0; i < val_li.size(); i++) {
			answer *= (val_li.get(i) + 1);
		}

		return answer - 1;
	}

}
