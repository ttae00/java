package javaproject_2w;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

/*
 * 빌보드 차트 파일을 저장한 디렉토리 찾기
 * 빌보드 차트 파일이 저장된 디렉토리를 찾아보자(billboard)
 * 힌트: File 클래스를 이용하여 디렉토리를 찾고 디렉토리에 있는 파일을 찾는다
 * 
 */
public class BillFiles088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.io.file 클래스는 파일에 관련된 클래스와 정보를 제공한다.
		File f= new File("billboard"); // billboard 디렉토리
		//디렉토리 내부에 포함된 모든 파일을 배열로 반환한다
		File[] fd= f.listFiles(); //바로 아래 파일들(자식 파일)
		
		for(File ff:fd) {
			String fname= ff.getName(); //파일명
			String post= fname.substring(fname.lastIndexOf(".")+1); //확장자(파일명.확장자)
			System.out.println(fname+" "+post);
			
			System.out.println(ff.getAbsolutePath()); //전체 경로
			
			//수정날짜를 입력하여 Date 객체로 날짜 정보를 얻는다.
			System.out.println(new Date(ff.lastModified())); //수정일
			try(BufferedReader br= new BufferedReader(new FileReader(ff.getAbsolutePath()))){
				String msg= "";
				while((msg=br.readLine())!=null) {
					System.out.println(msg);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("=============================");
			
		}
		

	}

}
