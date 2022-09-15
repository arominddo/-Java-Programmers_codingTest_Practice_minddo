package Level_1;

public class 짝수와_홀수 {

	public static void main(String[] args) {

		int num = 3;

		String answer = "";

		if (num % 2 == 0) {
			answer += "Even";
		} else {
			answer += "Odd";
		}

		// 목표 return = "Odd"
		System.out.println(answer);

	}

}
