package javaproject_2w;

//멤버 메서드를 이용하여 신체 지수 구하기
//non static 메서드(멤버), new 예약어를 이용하여 객체를 생성해야 한다.
public class BioCalendar030 {
	
	public static final int PHYSICAL = 23; // 상수(개발자 정의)

	//멤버 메서드(non static) 선언
	public double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days % index)* 2 * Math.PI/index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index= PHYSICAL; // 상수값을 변수에 대입
		int days= 1200;
		BioCalendar030 bio= new BioCalendar030(); // getBio- 멤버 메서드의 객체를 생성함
		
		//멤버 메서드 호출
		double phyval= bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다. \n", phyval);

	}

}
