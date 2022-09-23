package Level_1;

public class 문자열_다루기_기본 {

	public static void main(String[] args) {

		String s = "a234";
		// 목표 return = false
		
		System.out.println(solution(s));

	}

	static boolean solution(String s) {
		boolean answer = true;

		if (s.length() != 4 && s.length() != 6) {
			answer = false;
			return answer;
		}

		else {
			char[] tmp = s.toCharArray();

			for (int i = 0; i < tmp.length; i++) {
				if (!Character.isDigit(tmp[i])) {
					answer = false;
					return answer;
				}
			}
		}

		return answer;
	}

}
