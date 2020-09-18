package javaproject_4w;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 정보처리기사 문제2
 * 객체를 서로 비교하여 정렬하는 방법, 파일 읽기, 저장 방법을 익혀 보자.
 * 힌트: 객체 비교는 Comparator<Product>의 compare() 메서드를 구현한다
 * 
 * */
public class ProductReader160 {
	
	private List<String> list= new ArrayList<>();
	public boolean isExist(String fname) {
		boolean isE= false;
		File f= null;
		try {
			f= new File(fname);
			if(f.exists()) {
				isE= true;
			}
			
		}catch(Exception ee) {
			log(ee.getMessage());
		}
		return isE;
	}
	
	
	public int listSize() {
		return list.size();
		
	}
	
	public void readTexts(String fname) {
		list.clear();
		//빨대(FileReader)를 꽂는다. 노드인 FileReader를 생성한다. 노드는 꼭 한개 있어야 함
		FileReader fr= null;
		//호스(BufferedReader)를 준비한다. 필터인 버퍼리더를 생성한다.
		BufferedReader br= null;
		File ff= null;
		try {
			if(isExist(fname)) {
				ff= new File(fname);
				fr= new FileReader(ff);
				br= new BufferedReader(fr);
			}
			
			//한 줄씩 읽어서 리스트에 저장한다.
			String msg="";
			while((msg=br.readLine())!=null) {
				list.add(msg);
			}
		}catch(Exception ee) {
			log(ee.getMessage());
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception eee) {
				log(eee.getMessage());
			}
		}
	}
	
	public String readText(String fname) {
		String msg="";
		FileReader fr= null;
		BufferedReader br= null;
		File ff= null;
		
		try {
			if(isExist(fname)) {
				ff= new File(fname);
				fr= new FileReader(ff);
				br= new BufferedReader(fr);
			}
			//한줄만 읽는다
			msg= br.readLine();
		}catch(Exception ee) {
			log(ee.getMessage());
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception eee) {
				log(eee.getMessage());
			}
		}
		return msg;
	}
	
	public String getText(int i) {
			if(i+1>list.size()) {
				return "";
				
			}
			//리스트에서 임의의  위치 한 줄을 읽는다.
			return list.get(i);
	}
	
	private void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error-------->:"+msg);
	}
	
	//리스트를 반환한다.
	public List<String> getAllLines(){
		return list;
	}
	
	
}
