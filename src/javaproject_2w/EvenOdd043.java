package javaproject_2w;
/*
 * while�� �̿��Ͽ� 1�� �� ������ ������ ���ϱ�
 * �Էµ� ���� 1�� �� ������ Ȧ���� 3��+1, ¦���� 2�� ������
 * ��Ʈ: �ݺ������� ������ ������ ��Ȯ�� ����  while�� ����Ѵ�
 */

public class EvenOdd043 {
	
	public static void showOddEvenW(int n) {
		int temp =n;
		while (temp !=1) {
			if(temp%2==1) { //Ȧ��
				temp= temp*3+1;
			}else {
				temp= temp/2; //¦��
			}
			System.out.print("["+temp+"]");
			//System.out.println("["+temp+"]");
		}
		System.out.println("\n---------------"); //1 ����⸦ ������ ���
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOddEvenW(122);
	}

}
