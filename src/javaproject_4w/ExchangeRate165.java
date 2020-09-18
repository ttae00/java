package javaproject_4w;
/*
 * 메서드를 이용하여 환율 구하기
 * 2번 이상 사용하는 문장을 메서드로 만든다
 * 
 * */
public class ExchangeRate165 {
	//나누는 행위를 반복 -> 메서드로 만든다
	public static double calculate(double krwMoney, double exchangeRatio) {
		return krwMoney/exchangeRatio;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double USD = 1113.00; //상수값
		final double JPY= 10.0624; //상수값
		double krw= 1000000; //변수값
		
		//계산1- 메서드 호출
		double result= calculate(krw, USD);
		System.out.printf("한화 %.2f원은 미국 달러로 %.2f달러입니다.\n", krw, result);
		
		//계산2- 메서드 호출
		result= calculate(krw, JPY);
		System.out.printf("한화 %.2f원은 일본 엔화로 %.2f엔입니다.\n", krw, result);
	}

}
