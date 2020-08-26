package javaproject_2w;

//char switch
public class SwitchCondition039 {
	public static int toNum(char c) {
		int tot=0;
		switch(c) {
		case'A':tot=1; break;
		case'T':tot=10; break;
		case'J':tot=11; break;
		case'Q':tot=12; break;
		case'K':tot=13; break;
		default: tot=c-'0'; break;
		} return tot;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c= 'J';
		int result= toNum(c);
		System.out.printf("%c=>%d\n",c,result);
	}

}
