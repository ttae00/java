package javaproject_2w;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar로 살아온 날 구하기
 * 달력에 관련된 클래스의 사용법을 익혀 보자.
 * 힌트: System.currentTimeMills(), Date, Calendar의 사용법을 익힌다. 
 * Date는 long과 String 관련 메서드만 있어서 사용할 수 있는 메서드가 적다.
 * Calendar는 추상 클래스이기 때문에 new 로 생성 못하고 getInstance() static 메서드로 생성해서 사용한다.
 * 1월~12월 대신 0월~11월, 일요일이 1, 토요일이 7로 사용된다.
 */
public class CalendarTest074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mills= System.currentTimeMillis();
		System.out.println(mills/1000/24/60/60); //며칠 경과
		
		Date d= new Date();
		System.out.println(d);
		Date dd= new Date(d.getTime()+24*60*60*1000); //하루 후
		System.out.println(dd);
		
		Calendar cal1970= Calendar.getInstance();
		//1970.1.1로 정보를 수정한다. 달이 0~11월로 되어 있으므로 1월은 1-1=0을 입력한다.
		cal1970.set(1970,1-1,1); //0월~11월, 1970.1.1
		
		Calendar today= Calendar.getInstance(); //오늘
		printCalendar(today);
		long minus= today.getTimeInMillis()- cal1970.getTimeInMillis();
		System.out.println(minus); //1970.1.1~ 오늘 msec
		System.out.println(minus/1000/24/60/60); //1970년부터 며칠 지났는가?
		
		
	}
	//캘린더 정보
	public static void printCalendar(Calendar c) {
		System.out.println("----------------");
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //며칠
		System.out.println(c.get(Calendar.AM_PM)); //1 PM, 0 AM
	}

}
