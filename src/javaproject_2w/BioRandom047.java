package javaproject_2w;
/*
 *while������ �̿��Ͽ� ���� �ٸ� �� ���� �����
 *!�� ������ ������ 
 * ��Ʈ:!true�� false, !false�� true�� �ȴ�.
 */
public class BioRandom047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,c=0;
		
		//a�� b�� ���ų� b�� c�� ���ų� c�� a�� ������ while�� �ݺ�
		//���� �ٸ� ���� �� ������ �ݺ��Ѵ�. ���� �ٸ� �� ���� �Ǹ� ������.
		while(a==b||b==c||c==a) {
		//while( !(a!=b && b!=c && c!=a))
			a=(int)(Math.random()*10+1);
			b=(int)(Math.random()*10+1);
			c=(int)(Math.random()*10+1);
			
		}
		System.out.printf("%d\t%d\t%d\t",a,b,c);
	}

}
