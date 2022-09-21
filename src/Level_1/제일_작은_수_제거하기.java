package Level_1;

import java.util.*;

public class 제일_작은_수_제거하기 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		// 목표 return 값 [4,3,2]
		
		System.out.println(Arrays.toString(solution(arr)));

	}

	static int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int[] arr2 = arr.clone();
        
        Arrays.sort(arr2);
		
		int min_num = arr2[0];
		
		answer = new int[arr.length-1];
		
		for (int i=0, j=0; i<arr.length;i++,j++) {
			if(arr[i]==min_num) {
				j--;
				continue;
			}
			else {
				answer[j] = arr[i];
			}
		}

        return answer;
	}
}
