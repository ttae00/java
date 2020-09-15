package javaproject_4w;

import java.io.File;
import java.util.Date;

import javaproject_2w.RestDay075;
import javaproject_3w.RestDay126;

/*
 * java.io.File�� ���� ���� ����ϱ�
 *  ���� ������ ����غ���
 *  ���(recursion-�޼��尡 �ڽ��� ȣ��)�� �̿��Ѵ�.
 * 
 */
public class AboutFiles131 {
	
	//������ ����ϱ�.
	public static void printTree(File ff) {
		
		if(ff.exists()) {
			File[] fd= ff.listFiles();
			if(fd==null || fd.length==0) {
				//������ ���ٸ� �۾��� ������
				return ;
			}else {
				for(File f: fd) {
					//���丮���� Ȯ���ϰ� 
					if(f.isDirectory()) {
						//��θ� ����Ѵ�.
						System.out.println(f.getAbsolutePath());
					}
				}
			}
		}
	}
	
	public static void aboutFile(File f) {
		System.out.println("-----------------------------");
		//������ ���� ���
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		//System.out.println(RestDay126.todate(new Date(f.lastModified())));
		System.out.println("canRead:"+f.canRead());
		System.out.println(f.length()+ "bytes.");
	}
	
	//��� ������ ������ ������ ���� �ݺ��� �Ǳ� ������ �ݵ�� ������ ������ �ʿ��ϴ�
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
		//�⺻(��Ʈ)�� �Ǵ� �⺻ ���丮�� ���Ѵ�
		File[] fs= File.listRoots();
		for(File f:fs) {
			if(f.isDirectory()) {
				printTree(new File(f.getAbsolutePath()));
			}
		}
		
		//�ش� ���丮�� �ִ� ��� ������ ������ ��͸� �̿��Ͽ� ���
		File f= new File("D:\\java");
		printTree2(f);
		System.out.println("---------------------------------");
		//A ���丮���� Z ���丮���� ��� ���丮�� ã�´�.
		for(char c= 'A'; c<='Z'; c++) {
			String dirNames= c + ":/"; // +System.lineSeparator();
			File allDirs= new File(dirNames);
				if(allDirs.exists()) {
					long total= (long)allDirs.getTotalSpace();
					long free= (long)allDirs.getFreeSpace();
					//�ش� ���丮�� ���� �������� ��� �ִ� ������ ���� �����Ͱ� ����� ���� ũ���̴�. �����Ͱ� ����� ������ ����(%)�� ���Ѵ�
					double used= (double)(1-free*1.0/total)*100;
					String str= c+ ":\\���丮�� ��뷮: " + used + "%";
					System.out.println(str);
				}
			
		}
		
	}

}
