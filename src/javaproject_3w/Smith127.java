package javaproject_3w;
//&& �� ������
public class Smith127 {

	public static void printSmith(int t1, int t2) {
		for(int i=t1; i<t2; i++) {
			
			//�Ҽ��� ���μ� ���ذ� ���� �ʱ� ������ �Ҽ��� ���̽� ���� �� �� ����.
			if(!Java200Math127.isPrime(i) && Java200Math127.sumEach(i) == Java200Math127.sumEach(i)){ //���̽�
				System.out.printf("%d�� ���̽� ��",i);
				Java200Math127.printPrimeDivide(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10000~20000 ������ ���̽� ��
		printSmith(10000, 20000);
	}

}
