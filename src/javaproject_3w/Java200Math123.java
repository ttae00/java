package javaproject_3w;
/* 
 * 어려움!
 * 약수와 소인수 분해하기
 * 약수를 구하고 정수를 소인수 분해해보자
 * 힌트: 약수는 나누어 떨어지는 수이고, 소수로 나누는 것을 소인수 분해라고 한다.
 *  
 */
public class Java200Math123 {
	
	public static void printDivide(int n) {
		if(n==1) {
			System.out.println("[1]");
		}else {
			//2 이상에 대해 반드시 1로 시작하기 때문에 "[1,"을 출력한다.
			System.out.print("[1,");
			//정수 n을 2~n-1로 나누어 떨어지면 약수이다
			for(int i=2; i< n; i++) {
				//나머지
				if(n%i==0) {
					System.out.printf("%d,", i);
				}
			}
			//정수 n 자신도 약수이다
			System.out.println(n+"]");
		}
	}
	
	public static void printPrimeDivide(int n) {
		
		//2부터 나누어 본다
		int a= 2;
		
		//n이 1이 될 때까지 반복한다
		while(n!=1) {
			//n이 a로 나누어 떨어지면 소수로 나누어 떨어지므로 소인수 분해 과정이 된다.
			if(n%a==0) {
				//몫이 1이면 n과 a가 같다. 소인수 분해의 마지막 수가 된다. 예로 5에서 5는 몫이 1
				if(n/a==1){
				System.out.println(a);
				}else {
				System.out.print(a+"x");
				}
				//소수로 나눈다. 10을 2로 나누면 몫이 5, 다시 5를 5로 나누면 몫이 1이 되어 소인수 분해 끝.
				n/=a;
			//n이 a로 나누어 떨어지지 않으면	
			}else {
			//a의 값을 1 증가시킨다. 5는 2로 나누어 떨어지지 않으므로, 3,4,5까지 1씩 증가시킨다.
			a++;
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDivide(194560);
		printPrimeDivide(194560);
	}

}
