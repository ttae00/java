package javaproject_2w;

//case
public class BioSwitch036 {
	//조건에 따라 신체,감정,지성값을 출력

	public static String textInfor(int index, double value) {
		String result= "";
		switch(index) {
		case 23: result= "신체 지수: "; break;
		case 28: result= "감정 지수: "; break;
		case 33: result= "지성 지수: "; break;
		
		} 
		//문자열+기본 타입은 문자열. "hello"+1+2 는 hello12, 1+2+"hello"는 3hello
		return result + (value*100);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index= 23; //신체 지수
		double value = 0.86;
		String st= textInfor(index, value); //static 메서드 호출 , new x
		System.out.println(st);
	}

}
