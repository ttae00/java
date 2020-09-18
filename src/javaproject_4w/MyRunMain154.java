package javaproject_4w;
/*
 * 각 쓰레드에서 자신의 작업을 한다. 
 * 
 */
public class MyRunMain154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRun154 mr1= new MyRun154(); //Runnable implements
		Thread t1= new Thread(mr1);
		MyThread154 t2= new MyThread154(); //Thread extends
		
		//익명 내부
		Thread t3= new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<500; i++) {
					System.out.print("R");
				}
			}
			
		});
		//Lambda
		new Thread(()->{
			for(int i=0; i<500; i++) {
				System.out.print("U");
			}
		}
	    ).start();
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=0; i<500; i++) {
			System.out.print("M");
		}
	}
}
