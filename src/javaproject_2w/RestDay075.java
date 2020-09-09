package javaproject_2w;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 다시 풀어보기!
 * Calendar와 String 사이 날짜 변환하기
 * 날짜 변환법을 익혀보자
 * 힌트: String과 Date, Date와 Calendar 사이의 변환을 익힌다.
 * 
 */

public class RestDay075 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="2017-06-13";
		Calendar d2= todate(st);
		System.out.println(toYMD1(d2));
		String st2= goGO(st,-7);
		System.out.println(st2);
		Calendar d3= todate(st2);
		
		System.out.println(toYMD1(d3));
		System.out.println(d3);

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
