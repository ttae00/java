package javaproject_5w;
/*
 * 1���� �迭�� �Ÿ� ǥ���ϱ�
 * ���ڿ� �迭�� �̿��ϰ� ���� for�� ����Ѵ�.
 * 
 */
public class Conversion176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names= {"CM","M","Inch", "Feet", "Yard","Mile"};
		//new String[]{} �� ���Ҵ� �����ϴ�
		for(int i=0; i<names.length; i++) {
			System.out.printf("%s\t\t\t",names[i]);
		}
		
		System.out.println();
		for(String ss: names) {
			System.out.printf("%s\t\t\t", ss);
		}
		System.out.println();
	}

}
