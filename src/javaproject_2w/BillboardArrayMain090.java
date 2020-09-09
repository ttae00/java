package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/*
 * 빌보드 차트 웹 사이트에서 정보를 읽어 리스트에 저장하기
 * 정보를 읽어 리스트에 저장해 보자. 
 * 힌트: 웹사이트 주소에서 문자열을 한 줄씩 읽어서 리스트에 저장한다.
 */
public class BillboardArrayMain090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String만 저장할 수 있는 ArrayList 객체 생성. 리스트에 빌보드 웹사이트에서 읽은 내용을 저장
		ArrayList<String> str= new ArrayList<String>();
		//빌보드 웹사이트 경로
		String newUrls="https://www.billboard.com/charts/hot-100/";
		
		//웹사이트 경로를 찾는 URL클래스를 선언한다.
		URL url= null;
		try {
			//웹사이트 경로를 입력하고 URL 객체를 생성해서 주소를 찾는다
			url= new URL(newUrls);//주소 찾기
			
			//주소지에 빨대 꽂기, 주소에서 빌보드 정보를 읽기 위해 BufferedReader 객체를 생성한다.
			//주소지에 연결하고 한글이 깨지지 않도록 "euc-kr"로 설정하고 읽을 호스(url)를 연결한다.
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
	
			String line= null;
			//웹사이트에서 더 이상 읽을 것이 없을 때까지 한 줄씩 읽는다.
			while((line=br.readLine())!=null) {
				
				//읽은 문자열이 공백이 아니면 읽은 문자열을 리스트에 저장한다
				if(!line.trim().equals("")) {
					//System.out.println(line.trim());
					str.add(line.trim());
				}
			}
		//	System.out.println(str);
		}catch(Exception e) {
			System.out.println("billboard parsing error!!");
		}
		
		//향상된for을 이용하여 리스트에 저장된 내용을 한 줄씩 출력한다.
		for(String str1: str) {
			System.out.println(str1);
		}
		
	}

}
