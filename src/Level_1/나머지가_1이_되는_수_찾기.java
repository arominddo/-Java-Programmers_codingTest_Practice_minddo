package Level_1;

public class 나머지가_1이_되는_수_찾기 {

	public static void main(String[] args) {
		// 입력값
		int n = 10;			// 목표 result = 3
		
		int answer = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);

	}

}
