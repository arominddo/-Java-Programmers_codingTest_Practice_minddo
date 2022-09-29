package Level_1;

import java.util.*;

public class 크레인_인형뽑기_게임 {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		// 목표 result = 4
		int target = 4;

		// 정답
		int sol = solution(board, moves);
		System.out.println("나의 정답 : " + sol);
		System.out.println("정답인가요? : " + (sol == target));

	}

	static int solution(int[][] board, int[] moves) {

		int answer = 0;

		ArrayList<Integer> basket = new ArrayList<>();

		for (int i : moves) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][i - 1] == 0) {
					continue;
				} else {
					int tmp = board[j][i - 1];
					board[j][i - 1] = 0;
					if (basket.size() == 0) {
						basket.add(tmp);
						break;
					} else {
						if (basket.get(basket.size() - 1) == tmp) {
							basket.remove(basket.size() - 1);
							answer += 2;
							break;
						} else {
							basket.add(tmp);
							break;
						}
					}

				}

			}
		}
		return answer;
	}

}
