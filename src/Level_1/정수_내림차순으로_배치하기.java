
package Level_1;

import java.util.*;

public class 정수_내림차순으로_배치하기 {

	public static void main(String[] args) {
		long n = 118372;

		long answer = 0;

		String str = "" + n;

		String[] tmp = str.split("");

		Arrays.sort(tmp, Collections.reverseOrder());

		answer = Long.parseLong(String.join("", tmp));

		System.out.println(answer);
	}

}
