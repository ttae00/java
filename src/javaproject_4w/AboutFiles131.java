package javaproject_4w;

import java.io.File;
import java.util.Date;

import javaproject_2w.RestDay075;
import javaproject_3w.RestDay126;

/*
 * java.io.File로 파일 정보 출력하기
 *  파일 정보를 출력해보자
 *  재귀(recursion-메서드가 자신을 호출)을 이용한다.
 * 
 */
public class AboutFiles131 {
	
	//절대경로 출력하기.
	public static void printTree(File ff) {
		
		if(ff.exists()) {
			File[] fd= ff.listFiles();
			if(fd==null || fd.length==0) {
				//파일이 없다면 작업을 끝낸다
				return ;
			}else {
				for(File f: fd) {
					//디렉토리인지 확인하고 
					if(f.isDirectory()) {
						//경로를 출력한다.
						System.out.println(f.getAbsolutePath());
					}
				}
			}
		}
	}
	
	public static void aboutFile(File f) {
		System.out.println("-----------------------------");
		//파일의 절대 경로
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		//System.out.println(RestDay126.todate(new Date(f.lastModified())));
		System.out.println("canRead:"+f.canRead());
		System.out.println(f.length()+ "bytes.");
	}
	
	//재귀 끝나는 조건이 없으면 무한 반복이 되기 때문에 반드시 끝나는 조건이 필요하다
	public static void printTree2(File ff) {
		if(ff.exists()) {
			File[] fd= ff.listFiles();
			if(fd==null || fd.length==0) {
				return ;
			}else {
				for(File f: fd) {
					if(f.isDirectory()) {
						System.out.println("------"+f.getAbsolutePath());
						printTree2(ff);
					}else {
						aboutFile(f);
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본(루트)이 되는 기본 디렉토리를 구한다
		File[] fs= File.listRoots();
		for(File f:fs) {
			if(f.isDirectory()) {
				printTree(new File(f.getAbsolutePath()));
			}
		}
		
		//해당 디렉토리에 있는 모든 파일의 정보를 재귀를 이용하여 출력
		File f= new File("D:\\java");
		printTree2(f);
		System.out.println("---------------------------------");
		//A 디렉토리부터 Z 디렉토리까지 모든 디렉토리를 찾는다.
		for(char c= 'A'; c<='Z'; c++) {
			String dirNames= c + ":/"; // +System.lineSeparator();
			File allDirs= new File(dirNames);
				if(allDirs.exists()) {
					long total= (long)allDirs.getTotalSpace();
					long free= (long)allDirs.getFreeSpace();
					//해당 디렉토리의 저장 공간에서 비어 있는 공간을 빼면 데이터가 저장된 공간 크기이다. 데이터가 저장된 공간의 비율(%)을 구한다
					double used= (double)(1-free*1.0/total)*100;
					String str= c+ ":\\디렉토리의 사용량: " + used + "%";
					System.out.println(str);
				}
			
		}
		
	}

}
