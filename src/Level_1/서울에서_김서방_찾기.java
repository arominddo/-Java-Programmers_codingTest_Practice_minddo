package Level_1;

import java.util.*;

public class 서울에서_김서방_찾기 {

	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};

		// 목표 return = "김서방은 1에 있다"
		System.out.println(solution(seoul));
		

	}
	
	static private String solution(String[] seoul) {
        String answer = "";
        
        int a = Arrays.asList(seoul).indexOf("Kim");
        
        answer = String.format("김서방은 %d에 있다",a);
        
        return answer;
    }

}
