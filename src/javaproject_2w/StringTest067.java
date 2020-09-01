package javaproject_2w;
/*
 * String(���ڿ�) �����ϱ�
 * ���ڿ��� ����, ��ġ �� ���ڿ� ���� �޼��带 ���� ����.
 * ���ڿ��� ���̴� length(), Ư�� ������ ��ġ�� indexOf(����)�� ����Ѵ�. 
 * 
 */
public class StringTest067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= " Hello java4Android";
		String com= " HEllo java4Android";
		
		System.out.println(text.charAt(2));
		System.out.println(text.concat("s"));
		System.out.println(text.contains("And"));
		System.out.println(text.equals(com));
		//��ҹ��� ���� x
		System.out.println(text.equalsIgnoreCase(com));
		
		//���ڿ��� ó�� �߰ߵ� ��ġ�� ��ȯ�Ѵ�. ���ٸ� -1�� ��ȯ�Ѵ�. index=8
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		
		//trim() ���� ������ �����Ѵ�
		System.out.println(text.trim());
		//���ڿ��� ���� ��ȯ. ���鵵 ���Եȴ�. t=19
		System.out.println(text.length());
		
		//�Էµ� ��ġ�� ���ڿ� ������ �ڸ� ����, �� ��ġ���� ������ ��ȯ�Ѵ�. 0~6��°�� �߶������ 7��° ���ĸ� ��ȯ
		System.out.println(text.substring(7));
		System.out.println(text.substring(7,11));
		System.out.println(text.replace(" ", "-")); // replaceAll
		System.out.println(text.replaceAll(" ", "-"));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		//split(del)��  del ���ڸ� �������� ���ڿ��� �߶� �迭�� ��ȯ�Ѵ�.
		//sp = {"","hello","Java4Android"}�� ���ҵȴ�.
		String[] sp=text.split(" ");
		for(int i=0; i<sp.length; i++) {
			System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());
		}
	}

}
