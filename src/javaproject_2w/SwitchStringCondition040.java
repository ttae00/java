package javaproject_2w;

//String switch
public class SwitchStringCondition040 {
	
	public static double toMoney(String c) {
		double tot= 0;
		switch(c) {
		case "USD": tot=1126.5; break;
		case "JPY": tot=110.6; break;
		case "CNY": tot=10.5; break;
		default: tot=1; break;
		
		}
		return tot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String money= "USD";
		double result= toMoney(money);
		System.out.printf("%s => %f\n", money, result);
	}

}
