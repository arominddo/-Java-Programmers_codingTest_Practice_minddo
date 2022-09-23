package Level_1;

public class 부족한_금액_계산하기 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		// 목표 result = 10

		System.out.println(solution(price, money, count));

	}

	static long solution(int price, int money, int count) {
		long answer = 0;

		long Sn = (long) count * (price + price * count) / 2;

		answer = Sn - money;

		if (answer <= 0) {
			answer = 0;
		}

		return answer;
	}

}
