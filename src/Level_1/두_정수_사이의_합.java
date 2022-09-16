package Level_1;

public class 두_정수_사이의_합 {

	public static void main(String[] args) {
		
		
		//목표 return 12
		System.out.println(solution(3,5));

	}
	
	private static long solution(int a, int b) {
        long answer = 0;
        int tmp_big, tmp_small;
        
        if (a==b){
            return a;
        }
        else if(a>b){
            tmp_big = a;
            tmp_small = b;
        }
        else {
            tmp_big = b;
            tmp_small = a;
        }
        
        for (int i=tmp_small; i<=tmp_big;i++){
            answer += i;
        }
        
        return answer;
    }

}
