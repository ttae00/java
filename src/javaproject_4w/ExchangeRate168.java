package javaproject_4w;
/*
 * DTO(Date transfer object) 또는 VO(value object)는 객체를 데이터 저장이나 전송용으로 사용한다.
 * 멤버필드에 여러 데이터를 선언하기 때문에 한 객체를 저장, 전송하면 객체 내부의 많은 데이터를 저장, 전송할 수 있다.
 * DTO는 보통 은닉화(멤버필드의 private, 메서드의 public)을 위해 get/set을 많이 사용하지만 단순화 데이터를 저장,전송하는 경우에는
 * 은닉화를 하지 않을 수도 있다.
 * 
 * 
 * */
public class ExchangeRate168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//환율 정보를 객체에 저장
		FixerRate168 finance= new FixerRate168();
		finance.base="USD";
		finance.date= "2017-06-08";
		finance.usd=1;
		finance.jpy=110.22;
		finance.cny=6.7978;
		
		finance.krw=1123.3;
		finance.eur=0.89055;
		System.out.println(finance);
		
		//환율 정보를 이용하여 계산
		double krw= 1000000;
		double ratio= finance.krw;
		double result= ExchangeRate167.calculate(krw, ratio);
		System.out.printf("%.2fKRW은 %.2f%s입니다.\n", krw, result, finance.base);
	}
	
	public static double calculate(double krwMoney, double exchangeRatio) {
		// TODO Auto-generated method stub
		return krwMoney/exchangeRatio;	
	}

}
