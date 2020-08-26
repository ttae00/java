package javaproject_1w;

public class BioCalendar027 {
	public static final int PHYSICAL = 23;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=PHYSICAL;                  // 상수값을 변수에 대입
		int days=1200;   
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals=(days % index) * 2 * Math.PI / index ;
		System.out.println( Math.toDegrees(vals) +"도");
		//2*PI*r 라디안을 각도로 환산
		//toDegrees() : 각도변환
	}

}
