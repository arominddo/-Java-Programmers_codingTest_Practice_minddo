package Level_1;

public class 음양_더하기 {

	public static void main(String[] args) {
		
		
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		// 목표 return = 9
		
		System.out.println(solution(absolutes,signs));
		

	}

	static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			int tmp = signs[i] == true ? 1 : -1;
			answer += tmp * absolutes[i];
		}

		return answer;
	}

}
