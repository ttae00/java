package javaproject_2w;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * 다시 풀어보기
 * 빌보드 차트 정보를 파일로 저장하기
 * 힌트: 문자열(텍스트)를 저장할 때는 PrintWriter를 사용한다. 
 * 공부해야 할 것: java.io, PrintWriter, FileWriter(한글 처리 가능)
 */
public class BillFileWriter086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billboard083 b1= new Billboard083(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		Billboard083 b2 =new Billboard083(2,"That's What I Like",2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
		Billboard083 b3 =new Billboard083(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");
		
		ArrayList<Billboard083> bblist= new ArrayList<>();
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		//System.out.println(bblist);
		
		//billboard라는 파일을 만든다
		File f= new File("billboard");
		//billboard 파일이 존재하지 않는다면 make directory
		if(!f.exists()) {f.mkdirs();}
		
		//try(PrintWriter 생성){} 구문은 자바7에서 추가된 구문으로 finally를 사용하지 않고 {}를 끝내면 자동으로 PrintWriter를 close한다.
		//PrintWriter(FileWriter)을 이용하여 파일을 저장한다
		//billboard 디렉토리에 bill.txt 파일 이름으로 저장한다. bill.txt가 이미 있다면 내용을 모두 지우고 새로(false) 저장한다.
		try(PrintWriter pw= new PrintWriter(new FileWriter("billboard\\bill.txt",false), 
				//한 줄 저장하고 자동으로 파일이 확실하게 저장하도록 한다(true)
				true)){
			for(Billboard083 bb: bblist) {
				pw.println(bb);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
