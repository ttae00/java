package javaproject_2w;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 저장한 빌보드 차트 파일 정보 읽어들이기
 * 힌트: 문자열(텍스트)을 읽을 때는 BufferedReader을 사용한다
 * 공부해야 할 것: BufferedReader( FileReader )
 * 
 */
public class BillFileReader087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br= new BufferedReader(
				new FileReader("billboard\\bill.txt"))){
			String msg="";
			while((msg=br.readLine())!=null) {
				System.out.println(msg);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
