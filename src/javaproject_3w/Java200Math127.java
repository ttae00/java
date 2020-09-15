package javaproject_3w;
/*
 * 어려워!!!!!!!!!! 다시 해보기
 * 스미수 수 구하기(원래 수에 대한 각 자리합과 소인수 분해한 수의 각 자리 합이 같은 경우)
 * 힌트: 소인수 분해를 하고 각 소수에 대한 각 자리의 합을 구한다. 
 * 
 */

public class Java200Math127 {
	
	public static int sumEach(int n) { // n=123 일때
		int tot=0;
		while(n!=0) {
			//나머지, 각 자리수의 합
			//일의 자리수를 구하고 더한다.
			tot += n%10; //3->2->1
			
			//몫
			//자릿수를 줄인다. 123/10은 12, 12/10은 1, 1/10은 0으로 자릿수 줄일 수 있다.
			n/=10; //123->12->1-> 0
		}
		return tot;
	}
	
	//소수인지 판별
	public static boolean isPrime(int n) {
		boolean isS= true;
		
		//"에라토스테네스의 체" 원리: 25가 소수인지 판단하러면 25의 제곱근 5를 구하고 2~5로 25를 나누어 떨어지게 하는 수가 있다면 25는 소수가 아니다. 25는 5로 나누어 떨어지므로 소수가 아니다
		for(int i=2; i<(int)Math.sqrt(n); i++) {
			//나머지가 0이면
			if(n%i == 0) {
				isS= false;
				break;
			}
		}
		return isS;
	}
	
	public static int sumSmith(int n) {
		int tot=0;
		int a= 2;
		while(n!=1) {
			if(n%a==0) {
				//소인수 분해를 하고 소수가 구해지면 소수에 대한 각 자리의 합을 구한다
				tot += sumEach(a);
				n/=a;
				
			}else {
				a++;
			}
		}
		return tot;
	}
	
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

}
