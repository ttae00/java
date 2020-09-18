package javaproject_4w;

//Thread 클래스 상속하는 방법. run() 메서드 오버라이딩한다. 자신이 작업장이면서 작업을 구현.
public class MyThread154 extends Thread{
	
	public void run() {
			// TODO Auto-generated method stub
		for(int i=0; i<500; i++) {
				System.out.print("T");
		}
	}
}
