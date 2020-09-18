package javaproject_4w;
import java.io.*;
public class Product implements Serializable{
	private int      prodNum;   //������ȣ ���� 6  x
	private String   prodPart;  //�������� ���� 1
	private String   pName;     //�����  ���� 4
	private int      pValue;    //�ܰ�  ���� 3
	private int      pAmount;   // �ǸŶ� ���� 3
	private String   pPant;     // �����ڵ� ���� 1
	private String   pConsum;   // �ŷ��ڵ� ���� 1
	private int      pPoint;    // ��������Ʈ ���� 3  xxx
	private int      pCount;    // ��� Ƚ�� ���� 3
	private int      pMoney;    // ����� ���� 3     xxx
	private String   pGrade;    // ������� ���� 1
	public int getPAmount() {
		return pAmount;
	}
	public String getPConsum() {
		return pConsum;
	}
	public int getPCount() {
		return pCount;
	}
	public String getPGrade() {
		return pGrade;
	}
	public int getPMoney() {
		return pMoney;
	}
	public String getPName() {
		return pName;
	}
	public String getPPant() {
		return pPant;
	}
	public int getPPoint() {
		return pPoint;
	}
	public int getProdNum() {
		return prodNum;
	}
	public String getProdPart() {
		return prodPart;
	}
	public int getPValue() {
		return pValue;
	}
	public void setPAmount(int i) {
		pAmount = i;
	}
	public void setPConsum(String string) {
		pConsum = string;
	}
	public void setPCount(int i) {
		pCount = i;
	}
	public void setPGrade(String string) {
		pGrade = string;
	}
	public void setPMoney(int i) {
		pMoney = i;
	}
	public void setPName(String string) {
		pName = string;
	}
	public void setPPant(String string) {
		pPant = string;
	}
	public void setPPoint(int i) {
		pPoint = i;
	}
	public void setProdNum(int i) {
		prodNum = i;
	}
	public void setProdPart(String string) {
		prodPart = string;
	}
	public void setPValue(int i) {
		pValue = i;
	}
	public void setProduct(String[] s){
		this.setProdNum(Integer.parseInt(s[0].trim()));
		this.setProdPart(s[1].trim());
		this.setPName(s[2].trim());
		this.setPValue(Integer.parseInt(s[3].trim()));
		this.setPAmount(Integer.parseInt(s[4].trim()));
		this.setPPant(s[5].trim());
		this.setPConsum(s[6].trim());
		this.setPPoint(Integer.parseInt(s[7].trim()));
		this.setPCount(Integer.parseInt(s[8].trim()));
		this.setPMoney(Integer.parseInt(s[9].trim()));
		this.setPGrade(s[10].trim());
	}
	public String toString(){
		StringBuffer bf=new StringBuffer();
		bf.append("-------------------------------")
		.append("["+this.prodNum+"/")
		.append(this.prodPart+"/")
		.append(this.pName+"/")
		.append(this.pValue+"/")
		.append(this.pAmount+"/")
		.append(this.pPant+"/")
		.append(this.pPoint+"/")
		.append(this.pCount+"/")
		.append(this.pMoney+"/")
		.append(this.pGrade+"]");
//		.append("========================");
		return bf.toString();
	}
}
