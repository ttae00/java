package javaproject_2w;
/* 다시 공부하기
 * 
 * 제곱근을 이용하여 소수 판별하기
 * 입력받은 수가 소수인지 판별해 보자.
 * 힌트: 제곱근을 구하는 Math.sqrt()를 이용하면 반복 횟수를 줄일 수 있다.
 */

public class PrimMath049 {
	
	public static boolean isPrime(int n) {
		boolean isS= true;
		//입력 받은 n의 제곱근까지 for문 수행
		//n이 2와 3이라면 for문이 실행되지 않고, isS가 true이므로 소수이다. n이 4라면 4의 제곱근 2로 나누어 떨어지기 떄문에 소수가 아니다.
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			//소수가 아니면
			if(n%2==0) {
				isS= false;
				//예를 들어 10을 2로 나누면 나누어 떨어져서 더 나누어 볼 필요가 없으므로 break를 사용해 반복문 for를 끝낸다.
				break;
			}
		}
		return isS;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		//소수인가 확인
		boolean isPrime =isPrime(num);
		if(isPrime) {
			System.out.printf("%d는 1과 자신으로만 나눠 떨어지는 소수이다.", num);
		}else {
			System.out.printf("%d은 소수가 아니다.",num);
		}
	}

}
