package Level_1;

import java.util.Arrays;

public class 최소직사각형 {

	public static void main(String[] args) {
		
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		// 목표 result = 4000
		
		System.out.println(solution(sizes));
	}
	
    static int solution(int[][] sizes) {
        int answer = 0;
        
        		
		int[] min_li = new int[sizes.length];
		int[] max_li = new int[sizes.length];
		
		for(int i =0; i<sizes.length;i++) {
			Arrays.sort(sizes[i]);
			min_li[i] = sizes[i][0];
			max_li[i] = sizes[i][1];
		}
		
		Arrays.sort(min_li);
		Arrays.sort(max_li);
		
		
		answer = min_li[sizes.length-1]*max_li[sizes.length-1];
		
		
        
        return answer;
    }

}
