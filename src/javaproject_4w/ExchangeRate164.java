package javaproject_4w;
/*
 * ������ ����� �̿��Ͽ� ȯ�� ���ϱ�
 * ����� ���� ������ �� ���� final Ű���带 ���δ�.
 * 
 */
public class ExchangeRate164 {
	public static void main(String[] args) {
		final double USD=1113.00;
		final double JPY=10.0624;
		double krw= 1000000; //������
		double result= krw/USD;
		System.out.printf("��ȭ %.2f���� �̱� �޷��� %.2f�޷��Դϴ�.\n", krw, result);
		result= krw/(JPY); //�Ϻ� 100�� 1006.24��
		System.out.printf("��ȭ %.2f���� �Ϻ� ��ȭ�� %.2f���Դϴ�.\n", krw, result);
	}
}
