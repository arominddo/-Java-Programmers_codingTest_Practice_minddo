package Level_1;

import java.util.*;

public class 신규_아이디_추천 {

	public static void main(String[] args) {

		String new_id = "...!@BaT#*..y.abcdefghijklm";

		// 목표 result
		String result = "bat.y.abcdefghi";

		// 확인
		System.out.println(solution(new_id));
		System.out.println(solution(new_id).equals(result));

	}

	static String solution(String new_id) {
		new_id = new_id.toLowerCase();

		String[] str_ar = new_id.split("");
		Vector<String> str_li = new Vector<>();

		for (String str : str_ar) {
			str_li.add(str);
		}

		String[] char_ar = { "-", "_", "." };
		Vector<String> char_li = new Vector<>(Arrays.asList(char_ar));

		int i = 0;
		while (i != str_li.size()) {
			if ((!char_li.contains(str_li.get(i))) && (!Character.isLetterOrDigit(str_li.get(i).charAt(0)))) {
				str_li.remove(i);
				continue;
			} else {
				i++;
			}
		}

		i = 0;
		Boolean check = false;
		while (i != str_li.size()) {
			if (str_li.get(i).equals(".")) {
				if (!check) {
					check = !check;
					i++;
					continue;
				} else {
					check = false;
					str_li.remove(i);
					i = 0;
					continue;
				}
			} else {
				check = false;
				i++;
			}
		}

		if (str_li.size() != 0) {
			if (str_li.get(0).equals(".")) {
				str_li.remove(0);
			}
		}

		if (str_li.size() != 0) {
			if (str_li.get(str_li.size() - 1).equals(".")) {
				str_li.remove(str_li.size() - 1);
			}
		}

		if (str_li.size() == 0) {
			str_li.add("a");
		}

		if (str_li.size() >= 16) {
			for (int a = str_li.size() - 1; a > 14; a--) {
				str_li.remove(a);
			}
		}

		if (str_li.get(str_li.size() - 1).equals(".")) {
			str_li.remove(str_li.size() - 1);
		}

		if (str_li.size() <= 2) {
			while (str_li.size() < 3) {
				str_li.add(str_li.get(str_li.size() - 1));
			}
		}
		String[] tmp = str_li.toArray(new String[str_li.size()]);

		String answer = String.join("", tmp);

		return answer;
	}

}
