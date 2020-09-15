package javaproject_4w;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 어...렵...
 * 파일을 복사해 보자
 * java.nio.Files.copy()를 이용한다 
 * 
 */
public class FilesCopys132 {
	
	/*23424123123.txt와 같이 long.txt로 저장된 파일을 20170503\23424123123.txt같은 "연월일\파일"로 복사한다.
	 * long 타입을 Date 타입으로 변환하고 SimpleDateFormat을 이용하여 "연월일" 형태의 문자열로 변환한다.
	 * 그리고  "연월일" 디렉토리로 해당 파일을 복사한다.
	 */

	public static void copyUsingFiles(File source, File target) {
		try {
			//source 파일을 target 파일로 복사한다. java.nio.files.copy()는 예외 처리가 필요하다
			Files.copy(source.toPath(), target.toPath());
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ff= new File("upload");
		//upload 디렉토리의 모든 파일을 찾는다
		File[] ffs= ff.listFiles();
		
		//2017-05-03 01:23
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat fds= new SimpleDateFormat("yyyyMMdd"); //20170503
		
		for(File fff:ffs) {
			
			//절대경로를 얻는다
			String absfile= fff.getAbsolutePath();
			
			if(fff.isFile()) {
				//절대 경로 중 마지막 "\" 뒤의 파일 이름을 얻는다. 예를 들어 upload\20170526\1495788293207.png에서 1495788293207.png를 얻는다.
				String f= (absfile).substring(absfile.lastIndexOf("\\")+1);
				String fre= "";
				if(f.indexOf('.')>=0) {
					fre= f.substring(0,f.indexOf('.'));
				}
				//long 타입을 Date로 변환시킨다.
				Date longDay = new Date(Long.parseLong(fre)); //long->Date
				//연-월-일 시:분 형식의 문자열로 변환시킨다.
				String fname= sdf.format(longDay); //Date->String
				
				String newFname= fds.format(longDay); //23424123123
				System.out.println(fname+ "\t\t" + newFname); //Date -> String
				//23424123123.txt -> 20170503/23424123123.txt
				File newFile= new File("upload\\" + newFname); //옮기려고 하는 디렉토리
				File toFile= new File("upload\\" + newFname+"\\"+f); //옮기려는 파일
				
				if(!newFile.exists()) {
					boolean iss= newFile.mkdir(); //존재하지 않으면 만들자
					if(iss) {
						copyUsingFiles(fff, toFile); //파일 복사
					}
				}else {
					copyUsingFiles(fff, toFile); //파일 복사
				}
				
				
			}
		}
		
		
	}

}
