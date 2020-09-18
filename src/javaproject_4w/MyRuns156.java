package javaproject_4w;
/*
 * 쓰레드와 자원 공유 - 동기화의 특징
 * 동기화의 이유와 사용법을 익혀 보자
 * synchronized 키워드를 사용한다
 * 
 */
public class MyRuns156 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		show();
	}

	//현재 쓰레드에서 작업을 마칠 때까지 다른 쓰레드는 기다린다
	public synchronized void show() {
		// TODO Auto-generated method stub
		
		//출력을 시작한 쓰레드에서 자신의 이름을 모두 출력하고, 다른 쓰레드의 이름을 출력한다.
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
