package javaproject_2w;
/*
 * while�� ���� �����ڸ� �̿��Ͽ� �� �ڸ����� �� ���ϱ�
 * ��� �����ڸ� ��������
 * ��Ʈ: ���� ������(=) �տ� �ִ� ���� ��ȣ�� ��� �������̴�. 
 * -= += /= ..
 */
public class Contraction048 {
	
	//static �޼���� new x
	public static int sumEach(int n) {
		int tot=0;
		while(n!=0) {
			tot += n % 10;//
			n /= 10;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= sumEach(123);
		System.out.printf("%d\t",sum);
	}

}
