package javaproject_4w;
/*
 * ������� �ڿ� ���� - ����ȭ�� Ư¡
 * ����ȭ�� ������ ������ ���� ����
 * synchronized Ű���带 ����Ѵ�
 * 
 */
public class MyRuns156 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		show();
	}

	//���� �����忡�� �۾��� ��ĥ ������ �ٸ� ������� ��ٸ���
	public synchronized void show() {
		// TODO Auto-generated method stub
		
		//����� ������ �����忡�� �ڽ��� �̸��� ��� ����ϰ�, �ٸ� �������� �̸��� ����Ѵ�.
		for(int i=0; i<500; i++) {
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
