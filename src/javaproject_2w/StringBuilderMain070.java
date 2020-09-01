package javaproject_2w;
/*
 * StringBuilder�� ���ڿ� ����,����,�߰��ϱ�
 * String�� ��������� �ٸ� Ư¡�� ���� StringBuilder�� ���� ����.
 * ��Ʈ: StringBuider�� ����ȭ���� ���� StringBuffer�̴�.
 * 
 */
public class StringBuilderMain070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//synchronized ���� ���� StringBuffer
		StringBuilder sb= new StringBuilder();
		sb.append("I")
			.append(" go")
			.append(" to school");
		
		//= System.out.println(sb.toString());
		System.out.println(sb);
		sb.replace(7, 11, "");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//0�� ���� ����.2��° ����
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//1,2��° ����
		sb.delete(1, 3);
		System.out.println(sb);
		
		String ss= sb.substring(0);
		System.out.println(ss);
		System.out.println(sb);
		
		String st= sb.substring(0,4);
		System.out.println(st);
		System.out.println(sb);
	}

}
