package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


/*
 * 다시 하기 (날짜가 뜨지 않음)
 * 이번 주 빌보드 차트 기준 날짜 찾기
 * 이번 주 빌보드 차트의 기준 날짜를 찾아보자
 * 힌트: String은 특정 문자열의 위치를 찾는 indexOf, 자르는 subString을 이용하여 날짜를 찾는다. 
 * 
 */
public class BillboardTimeMain091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newUrls="https://www.billboard.com/charts/hot-100/";
		
		String s="";
		URL url= null;
		try {
			url= new URL(newUrls); //주소 찾기
			
			//주소지에 빨대 꽂기
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
			String line="";
			
			while((line= br.readLine())!=null){ //한 줄씩 읽어들인다
				if(!line.trim().equals("")) { //문자열이 있다면
					//<time datetime= "2018-08-13">August 13, 2018</time>
					if(line.trim().contains("<time datetime=")) { //찾기
						System.out.println("있음");
						s= line.trim();
							//첫 번쨰">"를 찾아 ">" 뒤쪽을 버린다.
							s=s.substring(0,s.indexOf(">")-1); //<time datetime= "2018-08-13"
							//연-월-일 앞에 있는 문자열을 제거한다.
							s=s.substring(s.indexOf("\"")+1).trim(); 
							break;
							
					}
				}
			}
			
			
			
		}catch(Exception e) {
			System.out.println("파싱 에러");
		}
		
		System.out.println("빌보드 차트 날짜: " + s);

	}

}
