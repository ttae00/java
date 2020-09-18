package javaproject_4w;
/*
 * 쓰레드 사용하기
 * 힌트: 인터페이스 Runnable을 구현하거나 Thread 클래스를 상속한다. 
 * 
 * 쓰레드를 만드는 방법은 두 가지이다. 여기서는 Runnable을 implements하고  run() 메서드를 구현한다.
 * Runnable을 구현한 MyRun은 작업(run())만 구현한 것으로 작업장(쓰레드)이 필요하다. 
 *
 */
public class MyRun154 implements Runnable{
	
	public void run() {
		show();
	}
	public void show() {
		// TODO Auto-generated method stub
		for(int i=0; i<500; i++) {
			System.out.print("S");
		}
	}

}
