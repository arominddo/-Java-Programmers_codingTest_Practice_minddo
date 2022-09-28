package Level_1;

import java.util.*;

public class 일차_다트_게임 {

	public static void main(String[] args) {

		String dartResult = "1S2D*3T";
		// 목표 result = 37

		System.out.println(solution(dartResult));

	}

	static int solution(String dartResult) {

		String[] dart = dartResult.split("");

		ArrayList<ArrayList> game = new ArrayList<>();

		ArrayList<String> tmp = new ArrayList<>();

		Boolean ch = true;

		// 48 57
		for (String str : dart) {
			int num = (int) str.charAt(0);
			if (num >= 48 && num <= 57) {
				if (ch) {
					ch = false;
					tmp.add(str);
					continue;
				}
				if ((str.equals("0")) && (tmp.size() == 1)) {
					tmp.set(0, "10");
					continue;
				}
				game.add((ArrayList) tmp.clone());
				tmp.clear();
				tmp.add(str);
				continue;
			} else {
				tmp.add(str);
			}
		}
		game.add((ArrayList) tmp.clone());

		int[] score = new int[game.size()];

		ArrayList<String> mul = new ArrayList<>();
		mul.add("S");
		mul.add("D");
		mul.add("T");

		for (int i = 0; i < game.size(); i++) {
			for (int j = 0; j < game.get(i).size(); j++) {
				if (j == 0) {
					score[i] = Integer.parseInt("" + game.get(i).get(j));
					continue;
				} else if (j == 1) {
					score[i] = (int) Math.pow(score[i], mul.indexOf(game.get(i).get(j)) + 1);
				} else {
					if (game.get(i).get(j).equals("*")) {
						if (i == 0) {
							score[i] *= 2;
						} else {
							score[i] *= 2;
							score[i - 1] *= 2;
						}
					} else {
						score[i] *= -1;
					}
				}
			}
		}

		int answer = Arrays.stream(score).sum();

		return answer;

	}

}
