package Level_1;

import java.util.Arrays;

public class 행렬의_덧셈 {

	public static void main(String[] args) {

		// 입력 값
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		// 목표 return = [[4,6],[7,9]]

		
		// 각 행 렬 길이 구하기
		int len_1 = arr1.length;
		int len_2 = arr1[1].length;

		// return 받을 2차 리스트 구하기
		int[][] answer = new int[len_1][len_2];

		
		// 값 계산
		for (int i = 0; i < len_1; i++) {
			for (int j = 0; j < len_2; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		System.out.println(Arrays.deepToString(answer));

	}

}
