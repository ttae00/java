package javaproject_3w;
/* 
 * 13일의 금요일 구하기
 * Calendar를 이용한다.
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThirTeenFriday128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Date를 문자열로, 문자열을 Date로 변환할 때 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//오늘을 기준으로 Calendar객체를 생성한다
		Calendar cal = Calendar.getInstance();
		
		int currentyear= cal.get(Calendar.YEAR); //현재 연도
		int count=0;
		
		for(int year= 2000; year <=currentyear; year++) { //서기 2000년부터 현재까지
			for(int month= 0; month < 12; month++) { //1월은 0, 12월은  11
				cal.set(year, month, 13); //연도와 달 변경
				if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY ) {
					
					System.out.println((++count)+ "\t" + sdf.format(cal.getTime()));
				}
			}
		}
	}

}
