package javaproject_4w;

public class CakeEater157 extends Thread {
	
	//공유할 빵 접시 선언
	private CakePlate157 cake;
	
	public CakeEater157(CakePlate157 cake) {
		setCakePlate157(cake);
	}
	
	public void setCakePlate157(CakePlate157 cake) {
		this.cake= cake;
	}
	
	public CakePlate157 getCakePlate157() {
		return cake;
	}
	
	public void run() {
		for(int i=0; i<50; i++) {
			cake.eatBread();
		}
	}



}
