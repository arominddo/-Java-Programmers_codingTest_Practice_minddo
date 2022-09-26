package Level_1;

//import java.math.*;
import java.util.*;

public class 삼진법_뒤집기 {

	public static void main(String[] args) {

		int n = 45;
		// 목표 result = 7

		System.out.println(solution(n));

	}

	static int solution(int n) {
		int answer = 0;

		List li = new ArrayList();

		while (n != 0) {
			li.add(n % 3);
			n /= 3;
		}

		for (int i = 0; i < li.size(); i++) {
			answer += Math.pow(3, li.size() - i - 1) * (int) li.get(i);
		}

		return answer;
	}

}
