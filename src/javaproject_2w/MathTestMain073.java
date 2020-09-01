package javaproject_2w;
/*
 * 수학 관련 메서드 사용하기 
 * 많이 사용하는 수학 메서드를 사용해 보자.
 * 힌트: Math 클래스는 수학에 관련된 메서드를 제공한다.
 * 
 */
public class MathTestMain073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//constant(상수)
		System.out.println("Math.E : "+ Math.E);
		System.out.println("Math.PI : "+ Math.PI);
		
		//Method
		System.out.println("Math.abs(-5) 절대값: "+Math.abs(-5));
		System.out.println("Math.ceil(4.34) 올림: "+Math.ceil(4.34));
		//round의 리턴 타입은 int, rint의 리턴 타입은 double
		System.out.println("Math.round(4.34) 반올림: "+Math.round(4.34));
		System.out.println("Math.floor(4.34) 버림: "+(int)Math.floor(4.34));
		System.out.println("Math.rint(4.34) 반올림: "+ Math.rint(4.34));
		System.out.println("Math.max(45,78) : "+ Math.max(45,78));
		System.out.println("Math.min(45,78) : "+ Math.min(45,78));
		System.out.println("Math.pow(2,4) : "+ Math.pow(2,4));
		System.out.println("Math.log(30) : " +Math.log(30));
		System.out.println("Math.exp(3) : " +Math.exp(30));
		System.out.println("Math.sqrt(10) : " +Math.sqrt(10));
		
		//random
		double r= Math.random(); // 0<=r <1 실수
		System.out.println("Math.random(): "+r);
		
		
		
	}

}
