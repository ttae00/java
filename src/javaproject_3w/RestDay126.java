package javaproject_3w;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 126번 문제
 * Calendar를 이용하여 휴일(토요일, 일요일) 구하기 
 * Calendar는 추상 클래스로 Calendar.getInstance()를 이용해 생성한다.
 *
 */

/*
 * 다시 풀어보기!
 * Calendar와 String 사이 날짜 변환하기
 * 날짜 변환법을 익혀보자
 * 힌트: String과 Date, Date와 Calendar 사이의 변환을 익힌다.
 * 
 */

public class RestDay126 {
	
	public static boolean isRest(Calendar tod) {
		boolean isRest= false;
		if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY ||
				tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
			isRest= true;
		}
		return isRest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal= Calendar.getInstance();
		int lastDay= cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1; i<=lastDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); //1일 부터 마지막 날까지
			if(isRest(cal)) {
				System.out.println(toYMD1(cal)+"is Rest Day.");
			}
		}

	}
	
	public static Calendar todate(String ss) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Date dd= new Date();
		try {
			dd= sdf.parse(ss);
		}catch(ParseException e) {

		}
		Calendar cal= Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	
	//Calendar를 문자열로
	public static String toYMD1(Calendar dd) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}
	
	public static String toYMD2(Calendar dd) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(dd.getTime());
	}
	
	public static String goGO(String ss, int day) {
		Calendar cal= todate(ss);
		//-7일을 더하면 일주일 전
		cal.add(Calendar.DAY_OF_YEAR, day);
		//캘린더를 문자열로
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}

	//교재에 없는 부분
	public static String toWantedDay(String rs, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
