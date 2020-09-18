package javaproject_4w;
/*
 * 변수와 상수를 이용하여 환율 구하기
 * 상수는 값을 변경할 수 없고 final 키워드를 붙인다.
 * 
 */
public class ExchangeRate164 {
	public static void main(String[] args) {
		final double USD=1113.00;
		final double JPY=10.0624;
		double krw= 1000000; //변수값
		double result= krw/USD;
		System.out.printf("한화 %.2f원은 미국 달러로 %.2f달러입니다.\n", krw, result);
		result= krw/(JPY); //일본 100엔 1006.24원
		System.out.printf("한화 %.2f원은 일본 엔화로 %.2f엔입니다.\n", krw, result);
	}
}
