package javaproject_2w;
/*
 * 다시 풀기
 * Character를 이용하여 숫자와 특수문자 가려내기
 * 입력된 문자가 어떤 문자(숫자, 특수문자, 공백)인지 판별해보자
 * 힌트: char의 랩퍼 클래스 Chracter를 이용한다
 * 
 */
public class UsingCharacterMain076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character chr1= new Character('W');
		Character chr2= new Character('9');
		
		//isLetter는 문자가 입력되면 해당 문자의 문자(letter, character) 여부를  boolean 타입으로 리턴한다.
		if(Character.isLetter(chr1.charValue())){
			System.out.print("1: "+chr1.charValue());
		}
		
		System.out.print(" ");
		System.out.print('\u0057'); //16진수 유니코드
		System.out.println("\t");
		System.out.println(Integer.toHexString((int)chr1));
		System.out.println((int)chr1);
		if(Character.isDigit(chr2.charValue())) {
			System.out.println("2: "+ (int)chr2.charValue());
		}
		
		System.out.println("3: "+Character.getType('a')); //소문자 2
		System.out.println("4: "+Character.getType('A'));
		System.out.println("5: "+Character.getType('3'));
		
		System.out.println("7: "+Character.getType('\n'));
		
		
	}

}
