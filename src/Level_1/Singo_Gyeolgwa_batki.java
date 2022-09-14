package Level_1;

import java.util.*;

public class Singo_Gyeolgwa_batki {

	public static void main(String[] args) {
		// 입력값 받기
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };

		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };

		int k = 2;

		// 이용자 수 변수
		int len = id_list.length;

		// 정답값 배열 생성
		int[] answer = new int[len];

		// 신고목록 리스트 생성 신고자->피신고자 2차배열
		int[][] report_dic = new int[len][len];

		// 신고목록 리스트 초기화 -> 0 :신고안함, 1 :신고함
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				report_dic[i][j] = 0;
			} // j for문
		}

		// report 입력값을 불러와 신고자와 피신고자 구분 및 신고 여부 입력
		for (String str : report) {

			String[] tmp = str.split(" ");

			Loop1: for (int i = 0; i < len; i++) {

				if (tmp[0].equals(id_list[i])) {
					Loop2: for (int j = 0; j < len; j++) {
						if (tmp[1].equals(id_list[j])) {
							report_dic[i][j] = 1;
						}
					}
				} else {
					continue Loop1;
				}

			}
		}

		// 피신고 횟수 확인 리스트
		int[] check_li = new int[len];

		// 신고 당하면 확인 리스트 +1
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (report_dic[i][j] == 1) {
					check_li[j] += 1;
				}
			}
		}

		// 신고당한 횟수가 k번을 넘는지 확인
		// 그 후 k번을 넘게 신고당한 자를 신고한 이용자에게 메일 1개 추가
		for (int i = 0; i < len; i++) {
			if (check_li[i] >= k) {
				for (int j = 0; j < len; j++) {
					if (report_dic[j][i] == 1) {
						answer[j] += 1;
					}
				}
			}
		}

		// 결과 확인
		System.out.println(Arrays.toString(answer));

	}

}
