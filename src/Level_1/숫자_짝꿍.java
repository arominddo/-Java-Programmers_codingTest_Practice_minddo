package Level_1;

import java.util.*;

public class 숫자_짝꿍 {

	public static void main(String[] args) {

		String X = "5525";
		String Y = "1255";

//		String X = "100";
//		String Y = "2345";

		// 목표 result
		String result = "552";

		// 확인

		System.out.println(solution(X, Y));
		System.out.println(solution(X, Y).equals(result));

	}

	static String solution(String X, String Y) {

		StringBuilder answer = new StringBuilder();

		int[] arrX = new int[10];
		int[] arrY = new int[10];

		for (int i = 0; i < X.length(); i++) {
			int index = X.charAt(i) - '0';
			arrX[index]++;
		}

		for (int i = 0; i < Y.length(); i++) {
			int index = Y.charAt(i) - '0';
			arrY[index]++;
		}

		for (int i = arrX.length - 1; i >= 0; i--) {
			while (arrX[i] >= 1 && arrY[i] >= 1) {
				arrX[i]--;
				arrY[i]--;

				answer.append(i);
			}
		}

		if (answer.toString().equals("")) {
			return "-1";
		} else if (answer.toString().startsWith("0")) {
			return "0";
		} else {

			return answer.toString();
		}

	}

}
