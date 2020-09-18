package javaproject_4w;

import java.util.Scanner;

/*
 * 입력값에 따라 환율 구하기 
 * 정수나 문자, 문자열에 따라 분기할 때는 switch case를 사용한다.
 * 
 */
public class ExchangeRate167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double USD= 1113.00;  //변수 값
 		double JPY= 10.0624; //변수 값
		double CNY= 164.1020; //변수 값
		double krw= 1000000; //백만원- 환전하려는 금액
		
		System.out.println("USD로 환전하려면 1, JPY로 환전하려면 2, CNY로 환전하려면 3을 입력하세요.");
		Scanner sc= new Scanner(System.in);
		int answer= sc.nextInt(); //키보드로 정수 입력
		double result=0.0;
		
		
		switch(answer){
			case 1: 
			result= calculate(krw, USD);
			System.out.printf("한화 %.2f원은 미국 달러로 %.2f달러입니다.\n", krw, result);
			break;
			
			case 2:
			result= calculate(krw, JPY);
			System.out.printf("한화 %.2f원은 일본 엔으로 %.2f엔입니다.\n", krw, result);
			break;
			
			case 3:
			result= calculate(krw, CNY);
			System.out.printf("한화 %.2f원은 중국 위안로 %.2f위안입니다.\n", krw, result);
			break;
			
			default: 
			System.out.println("환전 불가능");
			break;
		}
		

	}
	
	public static double calculate(double krwMoney, double exchangeRatio) {
		// TODO Auto-generated method stub
		return krwMoney/exchangeRatio;	
	}

}
