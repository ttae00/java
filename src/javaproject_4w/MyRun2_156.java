/*
 * 
 */
package javaproject_4w;

/**
 * @author 82102
 *
 */
public class MyRun2_156 implements Runnable {
	
	private int i=0; //��� �ڿ� ����
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		show();
	}

	public synchronized void show() {
		// TODO Auto-generated method stub
		
		//����� "i"�� �����ϱ� ������ 3���� �����忡�� ����� �� �ִ�.
		//����� ���۵Ǹ� �ٸ� ������� �ٲ� �� ���� ������ 500ȸ ��� �ڽ��� �̸��� ����Ѵ�.
		//i�� �����Ǳ� ������ �ٸ� �����忡�� �����Ϸ��� �� ��, i�� 500�̹Ƿ� �������� ���ϰ� ������.
		for(; i<500; i++) {
			if(((Thread.currentThread()).getName()).equals("a")){
				System.out.print("A");
			}else if(((Thread.currentThread()).getName()).equals("b")) {
				System.out.print("B");
			}else if(((Thread.currentThread()).getName()).equals("c")) {
				System.out.print("C");
			}else {
				System.out.print("[" + Thread.currentThread().getName()+i+"]");
			}
		}
	}

}
