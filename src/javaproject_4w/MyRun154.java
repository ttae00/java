package javaproject_4w;
/*
 * ������ ����ϱ�
 * ��Ʈ: �������̽� Runnable�� �����ϰų� Thread Ŭ������ ����Ѵ�. 
 * 
 * �����带 ����� ����� �� �����̴�. ���⼭�� Runnable�� implements�ϰ�  run() �޼��带 �����Ѵ�.
 * Runnable�� ������ MyRun�� �۾�(run())�� ������ ������ �۾���(������)�� �ʿ��ϴ�. 
 *
 */
public class MyRun154 implements Runnable{
	
	public void run() {
		show();
	}
	public void show() {
		// TODO Auto-generated method stub
		for(int i=0; i<500; i++) {
			System.out.print("S");
		}
	}

}
