package javaproject_2w;

//if && ||
public class JCalendar041 {
	
	//멤버 메서드는 객체를 생성한 후 레퍼런스(Jcal)로 호출해야함
	public boolean isLeapYear(int year) {
		boolean isS=false;
	
		//입력된 연도가 4의 배수이지만 100의 배수는 아니며 400의 배수이다.
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			isS=true;
		}
		return isS;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JCalendar041 Jcal= new JCalendar041();
		System.out.println(Jcal.isLeapYear(2017));
	}

}
