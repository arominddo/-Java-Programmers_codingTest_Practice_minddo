package Level_1;

public class 소수_찾기 {

	public static void main(String[] args) {
		
		int n = 10;
		// 목표 result = 4
		
		
		System.out.println("솔루션 1 :"+solution1(n));
		System.out.println("솔루션 2 :"+solution1(n));

	}
	
	
	/*
	소수 특성이용
	- A가 B로 나누어진다면, B또는 그 몫은
	A의 제곱근 보다 작다.
	*/
    static int solution1(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            boolean flag = true;
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0)  {
                  flag = false;
                      break;
                 } 
              }
         if(flag==true)
            answer++; 
       }
      return answer;
   }
    
    /*
    에라토스테네스의 체 이용
     */
    
    static int solution2(int n) {
        int answer = 0;
        
        int[] number = new int[n+1];
        
        //2부터 n까지의 수를 배열에 넣는다.
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }
        
        //2부터 시작해서 그의 배수들을 0으로 만든다.
        for(int i=2; i<=n; i++) {
            if(number[i]==0) continue;
            
            for(int j= 2*i; j<=n; j += i) {
                number[j] = 0;
            }
        }
        
        //배열에서 0이 아닌 것들의 개수를 세준다.
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                answer++;
            }
        }
        
        return answer;
    }

}
