package javaproject_4w;

import java.util.Calendar;

public class BioCalendar162 {
	//상수
	public static final int PHYSICAL= 23;
	public static final int EMOTIONAL= 28;
	public static final int INTELLECTUAL= 33;
	
	public static void main(String[] args) {
		Calendar birth= Calendar.getInstance();
		birth.set(1980, 3-1, 28); // 월은 0~11월이므로 3월은 3-1
		Calendar theDay= Calendar.getInstance(); //오늘 캘린더 생성한다
		
		//생일과 오늘에 대해 1970.1.1 부터의 경과일을 구한 후 오늘에서 생일을 빼면 태어나서 몇 밀리세컨드가 경과했는지 알 수있다.
		long dateBirth = birth.getTimeInMillis();
		long dateToDay= theDay.getTimeInMillis();
		long days= (dateToDay-dateBirth)/1000/24/60/60; //태어난지 며칠
		System.out.println(days);
		
		//(1)개발자가 정의한 메서드를 호출한다.
		double phyval= getBioRhythm(days , PHYSICAL , 100);
		double emoval= getBioRhythm(days, EMOTIONAL , 100);
		double inteval= getBioRhythm(days, INTELLECTUAL , 100);
		
		System.out.printf("나의 신체지수 %1$.2f입니다.\n", phyval);
		System.out.printf("나의 감정지수 %1$.2f입니다.\n", emoval);
		System.out.printf("나의 지성지수 %1$.2f입니다.\n", inteval);
	}

	public static double getBioRhythm(long days, int index, int max) {
		// TODO Auto-generated method stub
		return max*Math.sin((days % index) * 2 * Math.PI/index);
	}
	
	public static double getPhysical(long days, int max) {
		return getBioRhythm(days,PHYSICAL ,max);
	}
	
	public static double getEmotional(long days, int max) {
		return getBioRhythm(days,EMOTIONAL ,max);
	}
	
	public static double getIntellectual(long days, int max) {
		return getBioRhythm(days,INTELLECTUAL ,max);
	}
	
	public static long days(int year, int month, int day) {
		Calendar birth = Calendar.getInstance();
		birth.set(year, month-1, day); //0~11월
		Calendar theDay = Calendar.getInstance(); //오늘
		long dateBirth= birth.getTimeInMillis();
		long dateToDay= theDay.getTimeInMillis();
		long days= (dateToDay- dateBirth)/1000/24/60/60;
		return days;
	}
}
