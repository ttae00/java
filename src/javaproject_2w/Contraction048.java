package javaproject_2w;
/*
 * while과 단축 연산자를 이용하여 각 자릿수의 합 구하기
 * 축약 연산자를 익혀보자
 * 힌트: 대입 연산자(=) 앞에 있는 연산 기호는 축약 연산자이다. 
 * -= += /= ..
 */
public class Contraction048 {
	
	//static 메서드는 new x
	public static int sumEach(int n) {
		int tot=0;
		while(n!=0) {
			tot += n % 10;//
			n /= 10;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= sumEach(123);
		System.out.printf("%d\t",sum);
	}

}
