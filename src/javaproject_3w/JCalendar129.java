package javaproject_3w;
/*
 * 다시 해보기
 * 사용자 정의 만년 달력 만들기
 * 힌트: Calendar를 사용하지 않고, 서기 1년 1월 1일을 월요일(1)로 가정하고 만년 달력을 만든다. 
 * 
 */
public class JCalendar129 {

	public int[] LEAPY= {31,29,31,30,31,30,31,31,30,31,30,31}; //윤년
	public int[] PLAIN= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year) {
		boolean isS= false;
		if((year % 4 ==0) && (year% 100!=0) || (year%400 ==0)){
			isS= true;
		}
		return isS;
	}
	
	public int total(int year) { //total 오버로딩
		
		int tot=0;
		for(int i=1; i< year; i++) {
			if(isLeapYear(i)) {
				tot += 366; //윤년
			}else {
				tot +=365; //윤년 아닐 때
			}
		}
		return tot;
	}
	
	//2017 2->2016 1
	public int total(int year, int month) { //total 오버로딩
		int tot= total(year);
		for (int i=1; i<month; i++) {
			if(isLeapYear(year)) {
				tot += LEAPY[i-1];
			}else {
				tot += PLAIN[i-1];
			}
		}
		return tot;
	}
	
	public int total(int year, int month, int date) { //total 오버로딩
		int tot = total(year, month);
		return tot+date;
	}
	
	public int lastDay(int year, int month) { //해당 달의 마지막 날
		int tot = 0;
		if(isLeapYear(year)) {
			tot= LEAPY[month-1];
		}else {
			tot= PLAIN[month-1];
		}
		return tot;
	}
	
	public void showCal(int year, int month) {
		String s1= String.format("\t\t%d년\t%d월", year, month);
		String t1= String.format("일\t월\t화\t수\t목\t금\t토");
		System.out.println(s1);
		System.out.println(t1);
		int dateOfMonth = (1+total(year, month,1)-1)%7; // 요일??
		for(int i=0; i<dateOfMonth; i++) {
			System.out.println("\t");
		}
		for (int i=1; i<=lastDay(year, month); i++) {
			System.out.printf("%d\t",i);
			if((i+dateOfMonth)%7 ==0) {
				System.out.println();
			}
		}
		
		System.out.println("\n------------------");
		
	}
	
	public void showCal(int year) {
		String s1= String.format("\t\t\t%d", year);
		System.out.println(s1);
		for(int i=1; i< 13; i++) {
			showCal(year,i);
		}
	}
}
