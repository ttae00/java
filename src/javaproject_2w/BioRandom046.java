package javaproject_2w;
/*
 * while�� �̿��Ͽ� ���� �ٸ� �� ���� ����� 
 * ���� �ٸ� �� ������ ������
 * ��Ʈ: ������ ������ Math.random()�� �̿�
 */
public class BioRandom046 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,c=0;
		
		//while(true)�� ���� ����
		while(true) {
			//Math.random()�� ������ 0���� 1
			//�ִ밪 10,�ּҰ� 1
			a= (int)(10*Math.random()+1);
			b= (int)(10*Math.random()+1);
			c= (int)(10*Math.random()+1);
		    if(a!=b && b!=c && c!=a) break;
		}
		System.out.printf("%d\t%d\t%d\t",a,b,c);
	}

}
