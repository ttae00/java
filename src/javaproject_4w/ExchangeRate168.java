package javaproject_4w;
/*
 * DTO(Date transfer object) �Ǵ� VO(value object)�� ��ü�� ������ �����̳� ���ۿ����� ����Ѵ�.
 * ����ʵ忡 ���� �����͸� �����ϱ� ������ �� ��ü�� ����, �����ϸ� ��ü ������ ���� �����͸� ����, ������ �� �ִ�.
 * DTO�� ���� ����ȭ(����ʵ��� private, �޼����� public)�� ���� get/set�� ���� ��������� �ܼ�ȭ �����͸� ����,�����ϴ� ��쿡��
 * ����ȭ�� ���� ���� ���� �ִ�.
 * 
 * 
 * */
public class ExchangeRate168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ȯ�� ������ ��ü�� ����
		FixerRate168 finance= new FixerRate168();
		finance.base="USD";
		finance.date= "2017-06-08";
		finance.usd=1;
		finance.jpy=110.22;
		finance.cny=6.7978;
		
		finance.krw=1123.3;
		finance.eur=0.89055;
		System.out.println(finance);
		
		//ȯ�� ������ �̿��Ͽ� ���
		double krw= 1000000;
		double ratio= finance.krw;
		double result= ExchangeRate167.calculate(krw, ratio);
		System.out.printf("%.2fKRW�� %.2f%s�Դϴ�.\n", krw, result, finance.base);
	}
	
	public static double calculate(double krwMoney, double exchangeRatio) {
		// TODO Auto-generated method stub
		return krwMoney/exchangeRatio;	
	}

}
