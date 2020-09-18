package javaproject_5w;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//
public class PTS181 {
	
	//java.sql.Date -> "yyyy. MM. dd"
	public static String toSDate(Date msg) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy. MM. dd");
		return sdf.format(msg);
	}
	
	//"yyyy. MM. dd"->java.sql.Date
	public static Date toDaeS(String msg) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy. MM. dd");
		java.util.Date ud= new java.util.Date();
		
		try {
			ud= sdf.parse(msg);
		}catch(ParseException e) {
			
		}
		return new Date(ud.getTime());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
