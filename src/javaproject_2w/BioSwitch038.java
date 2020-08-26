package javaproject_2w;

//enum, switch case
public class BioSwitch038 {
	
	//메서드 선언
	public static String textInfor(PEI index, double value) {
		String result= "";
		switch(index) {
		//enum은 상수를 묶은 클래스. 상수값에 따라 case로 분기하기 떄문에 enum도 가능.
		case PHYSICAL: result="신체 지수: "; break;
		case EMOTIONAL: result="감정 지수: "; break;
		case INTELLECTUAL: result="지성 지수: "; break;
		default: result= "미결정: "; break;
		} return result + (value*100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PEI index= PEI.PHYSICAL;
		double value=0.86;
		System.out.println("신체 지수 주기값: "+index.getPei()); //enum을 int로 변환.해당 enum값 출력.
		
		String st= textInfor(index, value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
		
		
	}

}
