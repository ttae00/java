package javaproject_2w;

//static 메서드로 신체 지수 구하기
public class BioCalendar029 {
	
	public static final int PHYSICAL = 23; // 상수(개발자 정의)

	//static 메서드 선언(클래스 메서드)
	//static 메서드는 메서드에 static 예약어가 붙은 메서드로, '객체 생성 없이' 호출 가능
	//사용자 정의 static 선언, 반환타입은 double, 메서드 이름은 getBioRhythm
	public static double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days % index)* 2 * Math.PI/index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index= PHYSICAL; // 상수값을 변수에 대입
		int days= 1200;
		double phyval= getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다. \n", phyval);
	
	

	}

}
