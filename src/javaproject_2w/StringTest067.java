package javaproject_2w;
/*
 * String(문자열) 가공하기
 * 문자열의 길이, 위치 등 문자열 관련 메서드를 익혀 보자.
 * 문자열의 길이는 length(), 특정 문자의 위치는 indexOf(문자)를 사용한다. 
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
		//대소문자 구분 x
		System.out.println(text.equalsIgnoreCase(com));
		
		//문자열이 처음 발견된 위치를 반환한다. 없다면 -1을 반환한다. index=8
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		
		//trim() 양쪽 공백을 제거한다
		System.out.println(text.trim());
		//문자열의 길이 반환. 공백도 포함된다. t=19
		System.out.println(text.length());
		
		//입력된 위치의 문자열 앞쪽을 자른 다음, 그 위치부터 뒤쪽을 반환한다. 0~6번째를 잘라버리고 7번째 이후를 반환
		System.out.println(text.substring(7));
		System.out.println(text.substring(7,11));
		System.out.println(text.replace(" ", "-")); // replaceAll
		System.out.println(text.replaceAll(" ", "-"));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		//split(del)은  del 문자를 기준으로 문자열을 잘라 배열로 반환한다.
		//sp = {"","hello","Java4Android"}로 분할된다.
		String[] sp=text.split(" ");
		for(int i=0; i<sp.length; i++) {
			System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());
		}
	}

}
