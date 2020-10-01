package javaproject_5w;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * long->java.util.Date, java.util.Date->java.util.Calendar, java.util.Date->java.sql.Date,
 * String-> java.util.Date 로 변환할 수 있따. 
 * 
 * 
 */
public class PTS181 {
	
	
	//java.sql.Date -> "yyyy. MM. dd" 형식의 문자 변환
	public static String toSDate(Date msg) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy. MM. dd");
		return sdf.format(msg);
	}
	
	//"yyyy. MM. dd"->java.sql.Date
	public static Date toDaeS(String msg) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy. MM. dd");
		//.util.Date는 시,분,초를 가져올 수 있다.
		java.util.Date ud= new java.util.Date(); 
		
		try {
			ud= sdf.parse(msg);
		}catch(ParseException e) {
			
		}
		return new Date(ud.getTime()); //1970.1.1부터 경과시간을 밀리세컨드로 반환한다
	}
	
	//java.sql.Date->"yyyy-MM-dd"
	public static String toSDate2(Date msg) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(msg);
	}
	
	//java.util.Date ->"yyyy-MM-dd"
	public static String toDate3(java.util.Date msg) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(msg);
	}
	
	//today ->"yyyy-MM-dd"
	public static String toDay() {
		return toDate3(new java.util.Date());
	}
	
	//"yyyy-MM-dd"-> java.sql.Date
	public static Date toDaeS2(String msg) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date ud= new java.util.Date();
		try {
			ud= sdf.parse(msg);
		}catch(ParseException e) {
			
		}
		return new Date(ud.getTime());
	}
	
	//"   "-> \n 10칸 공백 -> 다음 줄
	public static void log(String msg) {
		String[] mmm= msg.split("          ");
		String ss= "";
		for(int i=0; i<mmm.length; i++) {
			if(mmm[i]!=null && !mmm[i].trim().equals("")) {
				ss+=""+mmm[i].trim()+ "\n";
			}
		}
		System.out.println("---------");
		System.out.println(ss.trim());
		System.out.println("---------");
	}
	
	//id=? -> id='101'
	public static String log2(String msg, String id) {
		String sms= msg.replace("?", "%s");
		String ss= String.format(sms, ""+id+"");
		return ss;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date s= toDaeS("2017.5.12");
		String t= toSDate2(s);
		System.out.println(t);
		String SQL= ""
				+"SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME,		"
				+"EMAIL, PHONE_NUMBER,HIRE_DATE FROM EMPLOYEES			"
				+"START WITH EMPLOYEE_ID= ?				"
				+"CONNECT BY PRIOR EMPLOYEE_ID = MANAGER_ID";
		log(SQL);
		log(log2(SQL,"100"));
	}

}
