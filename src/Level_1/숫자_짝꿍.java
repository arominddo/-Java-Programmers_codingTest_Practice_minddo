package Level_1;

import java.util.*;

public class 숫자_짝꿍 {

	public static void main(String[] args) {

		String X = "12321";
		String Y = "42531";
		
//		String X = "100";
//		String Y = "2345";

		// 목표 result
		String result = "321";

		// 확인

//		System.out.println(solution(X1, Y1));
		
		String answer = "";

		
		HashSet<String> set_X = new HashSet<>(Arrays.asList(li_X));
		HashSet<String> set_Y = new HashSet<>(Arrays.asList(li_Y));

		
		ArrayList<String> set = new ArrayList<>(set_X);

		ArrayList<String> tmp = new ArrayList<>();

		for (String i : set) {
			for (int j = 0; j < Math.min(Collections.frequency(li_X, i), Collections.frequency(li_Y, i)); j++) {
				tmp.add(i);
			}
		}
		System.out.println(set);
		if (tmp.size() == 0) {
			answer = "-1";
//			return answer;
			System.out.println(answer);
		}

		Collections.sort(tmp);
		

		if (tmp.get(tmp.size()-1).equals("0")) {
			answer = "0";
//			return answer;
			System.out.println(answer);
		}

		for (int i = tmp.size() - 1; i >= 0; i--) {
			answer += tmp.get(i);
		}
		
		System.out.println(answer);

	}

//	static String solution(String X, String Y) {
//		String answer = "";
//
//		ArrayList<String> li_X = new ArrayList<>(Arrays.asList(X.split("")));
//		ArrayList<String> li_Y = new ArrayList<>(Arrays.asList(Y.split("")));
//
//		HashSet<String> set_X = new HashSet<>(li_X);
//		HashSet<String> set_Y = new HashSet<>(li_X);
//
//		set_X.retainAll(set_Y);
//		ArrayList<String> set = new ArrayList<>(set_X);
//
//		ArrayList<String> tmp = new ArrayList<>();
//
//		for (String i : set) {
//			for (int j = 0; j < Math.min(Collections.frequency(li_X, i), Collections.frequency(li_Y, i)); j++) {
//				tmp.add(i);
//			}
//		}
//
//		if (set.size() == 0) {
//			answer = "-1";
//			return answer;
//		}
//
//		String[] str_tmp = tmp.toArray(new String[tmp.size()]);
//		Arrays.sort(str_tmp);
//
//		if (str_tmp[str_tmp.length - 1].equals("0")) {
//			answer = "0";
//			return answer;
//		}
//
//		for (int i = str_tmp.length - 1; i >= 0; i--) {
//			answer += str_tmp[i];
//		}
//
//		return answer;
//	}

}
