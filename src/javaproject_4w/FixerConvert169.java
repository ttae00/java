package javaproject_4w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/*
 * 
 * 웹 스크리핑을 이용하여 환율 구하기
 * 힌트: URL과 BufferedReader를 이용하여 웹 데이터를 스크래핑한다.
 *
 */


/* 1. URL을 이용하여 주소를 찾는다
 * 2. 웹 데이터를 제공하는 주소지에 노드(openStream(), 빨대 꽂기)를 준비한다 
 * 3. 노드를 필터(BufferedReader, 호스 연결)에 넣고 필터를 생성한다
 * 4. 필터에서 한 줄씩 읽는다. 한 줄씩 읽은 문자열을 붙여서 여러 줄의 문자열을 만든다.
 * 5. 여러 줄의 문자열을 JSON으로 변환하고, JSON에서 데이터를 읽어 DTO(FixerRate)에 저장한다.
 */
public class FixerConvert169 {

	public static String conversion(String date, String base) {
		
		//필터 선언. try{} 밖에서도 사용하기 위해 try{} 위에 선언한다.
		BufferedReader br= null;
		
		//JSON 데이터를 제공하는 주소를 입력한다.
		String newUrls1= "http://data.fixer.io/api/%s?access_key=97042483f2b64c6bfe1dbfbf4a2bd1b3&symbols=KRW,JPY,CNY,USD,EUR";
		
		//날짜와 화폐의 종류를 입력한다.
		String newUrls= String.format(newUrls1, date, base);
		URL url= null;
		//여러 줄의 문자열을 만듦(뮤터블 문자열)= 문자열을 입력해도 원래 주소를 유지하여 메모리를 아낀다.
		//문자열을 붙이는 과정에 주로 사용하고, 모두 붙이면 String으로 형 변환해야 한다.
		StringBuffer sb= new StringBuffer();
		
		try {
			url= new URL(newUrls); //http://data.fixer.io/api
			System.out.println(newUrls);
			br= new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
			String msg="";
			
			//http://data.fixer.io/api 를 읽어들인다.
			while((msg=br.readLine())!=null) {
				sb.append(msg);
			}
			
		}catch(Exception e) {
			
		}
		//모두 붙인 문자열을 String으로 변환한다.
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//날짜 형식을 준비한다. "연-월-일"의 문자열을 얻기 위해서이다.
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal= Calendar.getInstance();
		String date= sdf.format(cal.getTime());
		String base= "USD";
		
		String fixerrate= FixerConvert169.conversion(date, base);
		System.out.println(fixerrate);
		
		String base2= "JPY";
		String fixerrate2= FixerConvert169.conversion(date, base2);
		System.out.println(fixerrate2);
		
		String base3= "CNY";
		String fixerrate3= FixerConvert169.conversion(date, base3);
		System.out.println(fixerrate3);
		
	}

}
