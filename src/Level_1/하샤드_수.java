package Level_1;

public class 하샤드_수 {

	public static void main(String[] args) {

		int x = 10;
		// 목표 return = true

		boolean answer = true;

		int num = x;

		String tmp = "" + num;
		String[] tmp_li = tmp.split("");

		int sum = 0;

		for (int i = 0; i < tmp_li.length; i++) {
			sum += Integer.parseInt(tmp_li[i]);
		}

		if (x % sum != 0) {
			answer = false;
		}

		System.out.println(answer);

	}

}
