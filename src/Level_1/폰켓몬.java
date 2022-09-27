package Level_1;

import java.util.*;

public class 폰켓몬 {

	public static void main(String[] args) {
		
		int[] nums = {3,1,2,3};
		
		// 목표 result = 2
		
		
		System.out.println(solution(nums));

	}
	
    static int solution(int[] nums) {
        int answer = 0;
        
        ArrayList li = new ArrayList();
        
        for (int i=0; i<nums.length; i++){
            if (!li.contains(nums[i])) {
                li.add(nums[i]);
            }
        }
        
        if (li.size() >= nums.length/2){
            answer = nums.length/2;
        }
        else {
            answer = li.size();
        }
        
        return answer;
    }

}
