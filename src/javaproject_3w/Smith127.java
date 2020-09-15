package javaproject_3w;
//&& 논리 연산자
public class Smith127 {

	public static void printSmith(int t1, int t2) {
		for(int i=t1; i<t2; i++) {
			
			//소수는 소인수 분해가 되지 않기 때문에 소수는 스미스 수가 될 수 없다.
			if(!Java200Math127.isPrime(i) && Java200Math127.sumEach(i) == Java200Math127.sumEach(i)){ //스미스
				System.out.printf("%d는 스미스 수",i);
				Java200Math127.printPrimeDivide(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10000~20000 사이의 스미스 수
		printSmith(10000, 20000);
	}

}
