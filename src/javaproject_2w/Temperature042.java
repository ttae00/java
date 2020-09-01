package javaproject_2w;

//¹Ýº¹¹®
public class Temperature042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<101; i++) {
			
			//Á¤¼ö¸¦ ½Ç¼ö·Î ¹Ù²Ü ¶§ 9.0/5 Ã³·³ °¡Àå ¿ÞÂÊÀÇ ¼ö¸¦ ½Ç¼ö·Î ¹Ù²ãÁÜ
			double fahrenheit= 9.0/5*i+32; //for ºí·Ï º¯¼ö
			System.out.printf("¼·¾¾ %dµµ= È­¾¾ %.2fµµ\n",i,fahrenheit);
		}

	}

}
