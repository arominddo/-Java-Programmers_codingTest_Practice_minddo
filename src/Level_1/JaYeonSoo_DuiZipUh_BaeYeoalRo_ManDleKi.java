package Level_1;

import java.util.Arrays;

public class JaYeonSoo_DuiZipUh_BaeYeoalRo_ManDleKi {

	public static void main(String[] args) {

		// 입력값
		long n = 12345;

		// 입력값 저장 변수 만들기
		long num = n;

		// 입력된 숫자 자리수 구하기
		String tmp = Long.toString(num);
		int len_tmp = tmp.length();

		// 순서 바꿔 저장할 리스트 생성
		int[] answer = new int[len_tmp];

		// 순서 바꾸기
		for (int i = 0; i < len_tmp; i++) {
			answer[i] = (int) (num % 10);
			num /= 10;

		}

		System.out.println(Arrays.toString(answer));

	}

}
