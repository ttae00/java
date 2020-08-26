package javaproject_2w;

public class BioCalendar028 {
	
	public static final int PHYSICAL = 23;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index= PHYSICAL; // 상수값을 변수에 대입
		int days= 1200;
		double phyval= 100* Math.sin((days % index) * 2 * Math.PI/index);
		System.out.printf("나의 신체 지수 %1$.2f입니다. \n", phyval);
		System.out.printf("나의 신체 지수 %.2f입니다. \n", phyval);
		// $1은 첫 번째 변수  phyval를 1$ 위치에 대입하라는 의미. %f는 실수, %.2f는 소수점(.) 두 자리 까지만 표시

	}

}
