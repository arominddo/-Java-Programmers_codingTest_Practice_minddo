package Level_1;

public class 약수의_합 {

	public static void main(String[] args) {

		int n = 12;

		int answer = 0;

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		answer = sum;

		// 목표 return = 28
		System.out.println(answer);

	}

}
