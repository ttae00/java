package javaproject_2w;

//상수, switch case
public class BioSwitch037 {
	
	//상수
	/*
	 * public static final int PHYSICAL =23; public static final int EMOTIONAL =28;
	 * public static final int INTELLECTUAL =33;
	 */
	
	//한글로 했을 시 컴파일 확인
	public static final int 신체 =23;
	public static final int 감정 =28;
	public static final int 지성 =33;
	
	//static 메서드 선언
	public static String textInfor(int index, double value) {
		String result= "";
		switch(index) {
		case 신체: result= "신체 지수: "; break;
		case 감정: result= "감정 지수: "; break;
		case 지성: result= "지성 지수: "; break;
		default:result= "미결정: "; break;
		
		} 
		//문자열+기본 타입은 문자열. "hello"+1+2 는 hello12, 1+2+"hello"는 3hello
		return result + (value*100);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index= 신체; //신체 지수
		double value = 0.86;
		String st= textInfor(index, value); //static 메서드 호출 , new x
		System.out.println(st);
	}

}
