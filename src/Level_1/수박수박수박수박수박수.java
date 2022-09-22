package Level_1;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		
		int n = 3;
		// 목표 return = "수박수"
		
		System.out.println(solution(n));

	}

	static String solution(int n) {
		String answer = "";

		for (int i = 1; i < n + 1; i++) {
			if (i % 2 != 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}

		return answer;
	}
}
