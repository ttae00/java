package javaproject_4w;
/*
 * �޼��带 �̿��Ͽ� ȯ�� ���ϱ�
 * 2�� �̻� ����ϴ� ������ �޼���� �����
 * 
 * */
public class ExchangeRate165 {
	//������ ������ �ݺ� -> �޼���� �����
	public static double calculate(double krwMoney, double exchangeRatio) {
		return krwMoney/exchangeRatio;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double USD = 1113.00; //�����
		final double JPY= 10.0624; //�����
		double krw= 1000000; //������
		
		//���1- �޼��� ȣ��
		double result= calculate(krw, USD);
		System.out.printf("��ȭ %.2f���� �̱� �޷��� %.2f�޷��Դϴ�.\n", krw, result);
		
		//���2- �޼��� ȣ��
		result= calculate(krw, JPY);
		System.out.printf("��ȭ %.2f���� �Ϻ� ��ȭ�� %.2f���Դϴ�.\n", krw, result);
	}

}
