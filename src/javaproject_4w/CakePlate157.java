package javaproject_4w;
/*
 *  ������� wait, notifyAll �޼��� �����ϱ�= ����� ����
 *  ������ �������� �ŷڼ��� ���̴� ����� ������ ���� ����� �����غ���
 *  ��Ʈ: ����ȭ�� �޼��忡 ���� wait�� notifyAll �޼��带 ����Ѵ�.
 */
public class CakePlate157 {
	
	//��� �ڿ� ����
	private int breadCount= 0;
	public CakePlate157() {
		
	}
	
	//����ȭ�� �޼���: ���� �����忡�� �۾��� ��ĥ ������ �ٸ� ������� ��ٸ���
	//makeBread()�� ���� ������ �ٸ� �����忡�� breadCount ��� �Ұ�
	public synchronized void makeBread() {
		if(breadCount>=10) {
			try {
				System.out.println("���� ���´�.");
				//���� 10�� �̸��� �� ������ ��ٸ���.
				wait();
			}catch(InterruptedException ire) {}
			
			breadCount++; //���� 10���� �� �Ǹ� �� ������
			System.out.println("���� 1�� �� ���� ��: "+breadCount+"��");
			//���� ������ٴ� ����� �����Ѵ�. wait�� �����Ѵ�.
			//notifyAll�� ���ٸ� ��� wait�� �ϰ� �ǰ�, �̷��� ���°� ������̴�.
			this.notifyAll();
		}
	}
	
	//����ȭ�� �޼���: ���� �����忡�� �۾��� ��ĥ ������ �ٸ� ������� ��ٸ���
	public synchronized void eatBread() {
		if(breadCount<1) {
			try {
				System.out.println("���� ���ڶ� ��ٸ�");
				wait();
				
			}catch(InterruptedException ire){}
		}
		
		breadCount--; //���� ������ ����
		System.out.println("���� 1�� ���� ��: "+ breadCount +"��");
		this.notifyAll();
	}
}
