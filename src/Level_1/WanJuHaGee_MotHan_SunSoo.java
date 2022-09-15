package Level_1;

import java.util.*;

public class WanJuHaGee_MotHan_SunSoo {

	public static void main(String[] args) {
		// 입력값
//		String[] participant = {"leo", "kiki", "eden"};
//		String[] completion = {"eden", "kiki"};
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };

		// 결과 변수 생성
		String answer = "";

		// 해시맵 생성
		HashMap map = new HashMap();

		// 참가자 수 입력
		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) == null) {
				map.put(participant[i], 1);
			}

			else {
				int tmp = (int) map.get(participant[i]);
				map.put(participant[i], tmp + 1);
			}
		}

		// 완주자 수만큼 빼주기
		for (int i = 0; i < completion.length; i++) {
			int tmp = 0;
			tmp = (int) map.get(completion[i]);
			map.put(completion[i], tmp - 1);
		}

		List key_li = new ArrayList(map.keySet());
		List value_li = new ArrayList(map.values());

		for (int i = 0; i < key_li.size(); i++) {
			if ((int) value_li.get(i) == 1) {
				answer += key_li.get(i);
			}
		}

		System.out.println(answer);

	}

}
