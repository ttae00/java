package javaproject_4w;

public class MyRunsMain156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRuns156 mr1= new MyRuns156();
		
		//�� ���� �۾��� ������ 3���� �����尡 �غ�ȴ�.
		Thread t1= new Thread(mr1, "a");
		Thread t2= new Thread(mr1, "b");
		Thread t3= new Thread(mr1, "c");
		
		t1.start();
		t2.start();
		t3.start();
		
		}

}
