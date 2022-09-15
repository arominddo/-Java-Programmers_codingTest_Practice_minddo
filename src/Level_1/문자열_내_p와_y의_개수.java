package Level_1;

public class 문자열_내_p와_y의_개수 {

	public static void main(String[] args) {

		String s = "pPoooyY";
		// 목표 answer = true

		boolean answer = true;

		String[] tmp = s.split("");

		int p = 0;
		int y = 0;

		for (String str : tmp) {
			if (str.equals("p") || str.equals("P")) {
				p += 1;
			} else if (str.equals("y") || str.equals("Y")) {
				y += 1;
			}
		}

		if (y != p) {
			answer = false;
		}

		System.out.println(answer);
	}

}
