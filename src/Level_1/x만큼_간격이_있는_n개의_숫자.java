package Level_1;

import java.util.*;

public class x만큼_간격이_있는_n개의_숫자 {

	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		// 목표 answer = [2,4,6,8,10]
		
		long[] answer = new long[n];

		long num = x;
		long tmp = x;

		for (int i = 0; i < n; i++) {
			answer[i] = num;
			num += tmp;
		}
		
		System.out.println(Arrays.toString(answer));

	}

}
