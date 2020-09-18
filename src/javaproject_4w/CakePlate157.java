package javaproject_4w;
/*
 *  쓰레드와 wait, notifyAll 메서드 이해하기= 데드락 방지
 *  공유된 데이터의 신뢰성을 높이는 방법과 쓰레드 사이 통신을 이해해보자
 *  힌트: 동기화된 메서드에 대해 wait와 notifyAll 메서드를 사용한다.
 */
public class CakePlate157 {
	
	//멤버 자원 공유
	private int breadCount= 0;
	public CakePlate157() {
		
	}
	
	//동기화된 메서드: 현재 쓰레드에서 작업을 마칠 때까지 다른 쓰레드는 기다린다
	//makeBread()가 끝날 때까지 다른 쓰레드에서 breadCount 사용 불가
	public synchronized void makeBread() {
		if(breadCount>=10) {
			try {
				System.out.println("빵이 남는다.");
				//빵이 10개 미만이 될 때까지 기다린다.
				wait();
			}catch(InterruptedException ire) {}
			
			breadCount++; //빵이 10개가 안 되면 더 만들자
			System.out.println("빵을 1개 더 만듦 총: "+breadCount+"개");
			//빵을 만들었다는 사실을 공유한다. wait를 해제한다.
			//notifyAll이 없다면 계속 wait를 하게 되고, 이러한 상태가 데드락이다.
			this.notifyAll();
		}
	}
	
	//동기화된 메서드: 현재 쓰레드에서 작업을 마칠 때까지 다른 쓰레드는 기다린다
	public synchronized void eatBread() {
		if(breadCount<1) {
			try {
				System.out.println("빵이 모자라 기다림");
				wait();
				
			}catch(InterruptedException ire){}
		}
		
		breadCount--; //빵이 있으니 먹자
		System.out.println("빵을 1개 먹음 총: "+ breadCount +"개");
		this.notifyAll();
	}
}
