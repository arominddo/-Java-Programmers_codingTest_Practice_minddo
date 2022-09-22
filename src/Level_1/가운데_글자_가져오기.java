package Level_1;

public class 가운데_글자_가져오기 {

	public static void main(String[] args) {

		String s = "abcde";
		// 목표 return = "c"

		System.out.println(solution(s));

	}

	static String solution(String s) {
		String answer = "";

		int tmp = (int) s.length() / 2;

		if (s.length() % 2 != 0) {
			answer += s.charAt(tmp);
		} else {
			answer += "" + s.charAt(tmp - 1) + s.charAt(tmp);
		}

		return answer;
	}
}
