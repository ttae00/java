package javaproject_4w;
/*
 * ���� 154�� �ٸ���: �� �۾��� ���� �����忡�� �����Ѵ�.
 * �Ѿ����忡�� �۾��ϰ� �ֵ��� �ٸ� ������� ���߾� �ִ�.�����۾��� �䳻���� �ִ� ��.
 * 
 * 
 */

public class MyRunsMain155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRuns155 mr1= new MyRuns155();
		
		//�� ���� �۾��� ������ 3���� �����尡 �غ�ȴ�.
		Thread t1= new Thread(mr1, "a");
		Thread t2= new Thread(mr1, "b");
		Thread t3= new Thread(mr1, "c");
		//�� �����尡 �۾��� �� �ٸ� ������� ���߾� �ִ�. 3���� �����忡�� �۾��� �ϱ� ������ ������ �̸��� ������ ��µȴ�.
		t1.start();
		t2.start();
		t3.start();
		
	}

}
