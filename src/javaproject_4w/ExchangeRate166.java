package javaproject_4w;

import java.util.Scanner;

/*
 * �Է� ���ǿ� ���� ȯ�� ���ϱ� 
 * 
 * 
 */
public class ExchangeRate166 {
//if ���ǹ� -> 1�̸� USD��, 2�� JPY, 3�̸� CNY. 1,2,3 ���� �ٸ� ���� ȯ�� �Ұ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double USD= 1113.00;  //���� ��
 		double JPY= 10.0624; //���� ��
		double CNY= 164.1020; //���� ��
		double krw= 1000000; //�鸸��- ȯ���Ϸ��� �ݾ�
		
		System.out.println("USD�� ȯ���Ϸ��� 1, JPY�� ȯ���Ϸ��� 2, CNY�� ȯ���Ϸ��� 3�� �Է��ϼ���.");
		
		Scanner sc= new Scanner(System.in);
		int answer= sc.nextInt(); //Ű����� ���� �Է�
		double result=0.0;
		if(answer==1) {
			result= calculate(krw, USD);
			System.out.printf("��ȭ %.2f���� �̱� �޷��� %.2f�޷��Դϴ�.\n", krw, result);
			
		}else if(answer==2) {
			result= calculate(krw, JPY);
			System.out.printf("��ȭ %.2f���� �Ϻ� ������ %.2f���Դϴ�.\n", krw, result);
			
		}else if(answer==3) {
			result= calculate(krw, CNY);
			System.out.printf("��ȭ %.2f���� �߱� ���ȷ� %.2f�����Դϴ�.\n", krw, result);
		}else {
			System.out.println("ȯ�� �Ұ���");
		}
		
		
	}

	public static double calculate(double krwMoney, double exchangeRatio) {
	// TODO Auto-generated method stub
		return krwMoney/exchangeRatio;	
	}

}
