package Level_1;

public class 이상한_문자_만들기 {

	public static void main(String[] args) {
		
		String s = "try hello world";
		// 목표 return = "TrY HeLlO WoRlD"
		
		
		System.out.println(solution(s));
		
		

	}
	
	static String solution(String s) {
        String answer = "";
        
        String[] tmp = s.split("");
        
        int idx = 0;
        
        for (String str : tmp){
            idx = str.contains(" ") ? 0 : idx +1;
            answer += idx%2==0 ? str.toLowerCase() : str.toUpperCase();
        }
        
        return answer;
    }

}
