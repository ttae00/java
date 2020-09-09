package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;



/*
 * 다시 보기
 * 빌보드 차트 웹사이트에서 정보 읽어오기
 * 웹사이트 주소를 찾는 URL클래스를 이용한다. 
 * 
 */
public class BillboardMain089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newUrls="https://www.billboard.com/charts/hot-100/";
		URL url= null;
		try {
			url= new URL(newUrls); //추소 찾기
			
			//주소지에 빨대 꽂기
			BufferedReader br= new BufferedReader(
					new InputStreamReader(url.openStream(),"euc-kr"),8);
			String line= null;
			//한 줄씩 읽어서
			while((line= br.readLine())!= null) {
				//System.out.println(line);
				//공백이 아니면 출력한다.
				if(!line.trim().equals("")) {
					System.out.println(line.trim());
				}
			}
		}catch(Exception e) {
			System.out.println("빌보드 파싱 에러");
		}
	}

}
