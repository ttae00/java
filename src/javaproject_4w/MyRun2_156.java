/*
 * 
 */
package javaproject_4w;

/**
 * @author 82102
 *
 */
public class MyRun2_156 implements Runnable {
	
	private int i=0; //멤버 자원 공유
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		show();
	}

	public synchronized void show() {
		// TODO Auto-generated method stub
		
		//멤버인 "i"를 공유하기 때문에 3개의 쓰레드에서 사용할 수 있다.
		//출력이 시작되면 다른 쓰레드로 바뀔 수 없기 때문에 500회 모두 자신의 이름을 출력한다.
		//i는 공유되기 때문에 다른 쓰레드에서 시작하려고 할 때, i가 500이므로 실행하지 못하고 끝난다.
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
