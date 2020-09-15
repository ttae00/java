package javaproject_4w;

import javaproject_3w.Java200Math127;

/*
 * 다시 해보기
 * RSA 암호화를 해 보자.
 * 힌트: 나머지 구하기, 최대공약수를 이용한다. 
 * 
 */
public class RSA136 {
	
	public static final int START= 200;
	private int p=11;	
	private int q=7;
	private int n;
	private int phiN;
	private int e;
	private int d;
	
	public void makePQ() {
		p=(int)(Math.random()*START); //199
		q=(int)(Math.random()*START); //199
		
		while((p==q) || (p<100 || q<100) || (!Java200Math127.isPrime(p) || !Java200Math127.isPrime(q))) {
			p=(int)(Math.random()*START); //199
			q=(int)(Math.random()*START);
		}	
	}
	
	public void makeN() {
		n= p*q;
	}
	
	public void print() {
		System.out.printf("(p,q)=(%d, %d)\n"
				+ "(n,phi)=(%d,%d)\n(e,d)=(%d,%d)\n",p,q,n,phiN,e,d);
	}
	
	public int getN() {
		return n;
	}
	
	public void makePHIN() {
		this.phiN=(p-1)*(q-1);
	}
	
	public int getPhiN() {
		return phiN;
	}
	
	public void makeE() {
		ArrayList<Integer>
		es = new ArrayList<Integer>();
		for(int i=2; i<phiN; i++) {
			if(Java200Math127.gcd(phiN=i)== 1) {
				// 여기서 부터 다시.
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
