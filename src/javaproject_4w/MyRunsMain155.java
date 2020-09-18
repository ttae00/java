package javaproject_4w;
/*
 * 예제 154와 다른점: 한 작업을 여러 쓰레드에서 실행한다.
 * 한쓰레드에서 작업하고 있따면 다른 쓰레드는 멈추어 있다.동시작업을 흉내내고 있는 것.
 * 
 * 
 */

public class MyRunsMain155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRuns155 mr1= new MyRuns155();
		
		//한 개의 작업을 공유한 3개의 쓰레드가 준비된다.
		Thread t1= new Thread(mr1, "a");
		Thread t2= new Thread(mr1, "b");
		Thread t3= new Thread(mr1, "c");
		//한 쓰레드가 작업할 때 다른 쓰레드는 멈추어 있다. 3개의 쓰레드에서 작업을 하기 때문에 쓰레드 이름이 섞여서 출력된다.
		t1.start();
		t2.start();
		t3.start();
		
	}

}
