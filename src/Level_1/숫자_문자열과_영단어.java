package Level_1;

public class 숫자_문자열과_영단어 {

	public static void main(String[] args) {

		String s = "one4seveneight";
		// 목표 result = 1478

		System.out.println(solution(s));

	}

	static int solution(String s) {
		int answer = 0;

		String[] num_str = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String[] num_n = new String[10];

		for (int i = 0; i < 10; i++) {
			num_n[i] = "" + i;
		}

		for (int i = 0; i < 10; i++) {
			s = s.replaceAll(num_str[i], num_n[i]);
		}

		answer = Integer.parseInt(s);

		return answer;
	}

}
