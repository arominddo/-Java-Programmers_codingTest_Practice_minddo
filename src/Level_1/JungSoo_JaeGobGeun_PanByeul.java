package Level_1;

public class JungSoo_JaeGobGeun_PanByeul {

	public static void main(String[] args) {
		
		long n = 121;
		
		long answer = 0;

		double sqrt_n = Math.sqrt(n);

		if (sqrt_n - (int) Math.sqrt(n) == 0) {
			answer = (long) ((sqrt_n + 1) * (sqrt_n + 1));

		} else {
			answer = -1;
		}
		
		// 목표 return = 144
		System.out.println(answer);

	}

}
