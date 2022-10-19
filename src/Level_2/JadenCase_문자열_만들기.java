package Level_2;

public class JadenCase_문자열_만들기 {

	public static void main(String[] args) {
		String s = "3people unFollowed me";

		// 목표 result
		String result = "3people Unfollowed Me";

		// 확인
		System.out.println(solution(result));
		System.out.println(solution(result).equals(result));

	}

	static String solution(String s) {
		String answer = "";

		String[] tmp = s.split("");

		boolean start = true;

		for (String str : tmp) {
			if (str.equals(" ")) {
				start = true;
				answer += " ";
				continue;
			}

			if (start) {
				if (Character.isAlphabetic(str.charAt(0))) {
					answer += str.toUpperCase();
					start = false;
				} else {
					answer += str;
					start = false;
				}
			} else {
				answer += str.toLowerCase();
			}
		}

		return answer;
	}

}
