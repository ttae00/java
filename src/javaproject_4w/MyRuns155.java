package javaproject_4w;
/*
 * �������� �⺻ �޼���� Ư�� Ȯ���ϱ�
 * ����ǰ� �ִ� �������� �̸��� ����� ����.
 * ��Ʈ: getName()�� ������ �̸���, Thread.currentThread()�� ���� ���� ���� �����带 �˷� �ش�.
 * 
 */
public class MyRuns155 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		show();
	}

	public void show() {
		// TODO Auto-generated method stub
		for(int i=0; i<500; i++) {
			
			//Thread.currentThread()�� ����ǰ� �ִ� �����带 ��ȯ�Ѵ�. getName()�� �������� �̸��� ��ȯ�Ѵ�.
			if(((Thread.currentThread()).getName()).equals("a")){
				System.out.print("A");
			}else if(((Thread.currentThread()).getName()).equals("b")) {
				System.out.print("B");
			}else if(((Thread.currentThread()).getName()).equals("c")) {
				System.out.print("C");
			}else {
				System.out.print("["+ Thread.currentThread().getName()+ i+ "]");
			}
		}
	}

	
}
