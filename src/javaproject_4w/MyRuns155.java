package javaproject_4w;
/*
 * 쓰레드의 기본 메서드와 특성 확인하기
 * 실행되고 있는 쓰레드의 이름을 출력해 보자.
 * 힌트: getName()은 쓰레드 이름을, Thread.currentThread()는 현재 실행 중인 쓰레드를 알려 준다.
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
			
			//Thread.currentThread()는 실행되고 있는 쓰레드를 반환한다. getName()은 쓰레드의 이름을 반환한다.
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
