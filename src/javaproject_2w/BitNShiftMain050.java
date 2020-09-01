package javaproject_2w;
/* �ٽ� �����ϱ�
 * shift �����ڸ� �̿��Ͽ� 2���� ���ڿ��� �ٲٱ�
 * shift �����ڸ� �̿��Ͽ� 10���� ������ 2���� ���ڿ��� ��ȯ�غ���.
 * ��Ʈ: 2�� ���� �������� �̿��Ѵ�. a>>=1�� a/=2�� ���� ȿ���� ����.
 */

public class BitNShiftMain050 {
	//10���� ������ 2���� ���ڿ�(��Ʈ��)���� ��ȯ
	public static String shifts(int a) {
		String st="";
		for(int i=0;i<31; i++) {
			//a%2 �������� int aa�� �����Ѵ�
			int aa= a%2;
			//aa>=0�̸� aa�� st�� ���Ѵ�. �ƴ϶�� -aa�� st�� ���Ѵ�.
			st=(aa>=0)?aa+st:(-aa)+st;
			//���������� 1ĭ �̵��Ѵ�. �ڴ� ����.
			//a<<=1�̸� �������� 1ĭ �̵�. ù ��° �ڸ��� 0.
			a>>=1;      // a/=2;
		}
		return st;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNums1= 123;
		int intNums2= -123;
		System.out.printf("%d : %s%n", intNums1,shifts(intNums1));
	}

}
