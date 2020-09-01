package javaproject_2w;
/*
 * while을 이용하여 서로 다른 세 정수 만들기 
 * 서로 다른 세 정수를 만들자
 * 힌트: 임의의 정수는 Math.random()을 이용
 */
public class BioRandom046 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,c=0;
		
		//while(true)는 무한 루프
		while(true) {
			//Math.random()의 범위는 0부터 1
			//최대값 10,최소값 1
			a= (int)(10*Math.random()+1);
			b= (int)(10*Math.random()+1);
			c= (int)(10*Math.random()+1);
		    if(a!=b && b!=c && c!=a) break;
		}
		System.out.printf("%d\t%d\t%d\t",a,b,c);
	}

}
