package javaproject_2w;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

/*
 * System으로 연산 소요 시간 구하기
 * 0부터 100000까지의 합을 얻는 데 걸리는 시간을 구해보자.
 * 힌트: System.currentTimeMills()를 이용한다. 
 * 
 */
public class SystemTest071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long ltime= System.currentTimeMillis(); //1970.1.1부터
		//하루는 24*60*60*1000= 86,400,000 밀리세컨
		System.out.println(ltime);
		
		//long totSum=0;
		//10만번 출력을 반복한다. 
		for(int i=0; i<=100000; i++) {
			//totSum = totSum + i;
			System.out.print("");
		}
		//System.out.println(totSum);
		
		long ltime2= System.currentTimeMillis();
		//연산 후- 연산 전= 연산에 걸린 시간
		System.out.println((ltime2-ltime));
		
		//1970.1.1부터 현재까지 몇 년 지났는지 구한다.
		System.out.println(ltime2/1000/60/60/24/365+ "년");
		
		//시스템 환경변수를 반환한다. OS 관련 정보를 제공한다. 자바 VM 버전, 파일 분리자("\" or "/") 등.
		//시스템 변수를 (key,value)로 저장한 맵 계열 Properties로 반환한다.
		Properties pro=System.getProperties();
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		
		//Date에 현재까지의 경과 시간을 입력하면 오늘에 대한 정보를 얻을 수 있다.
		System.out.println(new Date(System.currentTimeMillis())); //오늘
		
		//--------------java.util.*에서----------------//
		//모든 System.property
		//(key,value)로 저장한 맵 계열 Properties에서 모든 키만 얻는다.
		Enumeration<Object> en= pro.keys();
		int i=0;
		//키가 있다면 키값을 얻고, 키 값에 대한 value를 얻는다.
		while(en.hasMoreElements()) {
			String keys=(String)en.nextElement();
			System.out.println((++i+" ")+ keys + " : "+ pro.getProperty(keys));
		}
	}
}
