package javaproject_4w;

public class CakeMaker157 extends Thread{
	//공유할 빵접시를 선언
	private CakePlate157 cake;
	
	//생성자
	public CakeMaker157(CakePlate157 cake) {
		setCakePlate157(cake);
	}
	public void setCakePlate157(CakePlate157 cake) {
		this.cake = cake;
	}
	
	public CakePlate157 getCakePlate157() {
		return cake;
	}
	
	//쓰레드를 상속하려면 run() 메서드를 오버라이딩해야 한다.
	public void run() {
		for(int i=0; i<50; i++) {
			cake.makeBread();
		}
	}
}
