package javaproject_2w;
/*
 * �ٽ� Ǯ��
 * Character�� �̿��Ͽ� ���ڿ� Ư������ ��������
 * �Էµ� ���ڰ� � ����(����, Ư������, ����)���� �Ǻ��غ���
 * ��Ʈ: char�� ���� Ŭ���� Chracter�� �̿��Ѵ�
 * 
 */
public class UsingCharacterMain076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character chr1= new Character('W');
		Character chr2= new Character('9');
		
		//isLetter�� ���ڰ� �ԷµǸ� �ش� ������ ����(letter, character) ���θ�  boolean Ÿ������ �����Ѵ�.
		if(Character.isLetter(chr1.charValue())){
			System.out.print("1: "+chr1.charValue());
		}
		
		System.out.print(" ");
		System.out.print('\u0057'); //16���� �����ڵ�
		System.out.println("\t");
		System.out.println(Integer.toHexString((int)chr1));
		System.out.println((int)chr1);
		if(Character.isDigit(chr2.charValue())) {
			System.out.println("2: "+ (int)chr2.charValue());
		}
		
		System.out.println("3: "+Character.getType('a')); //�ҹ��� 2
		System.out.println("4: "+Character.getType('A'));
		System.out.println("5: "+Character.getType('3'));
		
		System.out.println("7: "+Character.getType('\n'));
		
		
	}

}
