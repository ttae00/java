package javaproject_4w;

public class CakeMaker157 extends Thread{
	//������ �����ø� ����
	private CakePlate157 cake;
	
	//������
	public CakeMaker157(CakePlate157 cake) {
		setCakePlate157(cake);
	}
	public void setCakePlate157(CakePlate157 cake) {
		this.cake = cake;
	}
	
	public CakePlate157 getCakePlate157() {
		return cake;
	}
	
	//�����带 ����Ϸ��� run() �޼��带 �������̵��ؾ� �Ѵ�.
	public void run() {
		for(int i=0; i<50; i++) {
			cake.makeBread();
		}
	}
}
