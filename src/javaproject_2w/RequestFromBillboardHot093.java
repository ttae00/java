package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/*
 * �������!!
 * �̹� �� ������ ��Ʈ�� �Ľ��Ͽ� ��ü�� �����ϱ�
 * �̹� �� ������ ��Ʈ�� �Ľ��Ͽ� ��ü�� ������ ����
 * ��Ʈ: String�� Ư�� ���ڿ��� ��ġ�� ã�� indexOf,�ڸ��� subString�� �̿��Ͽ� ��¥�� ã�´�. 
 *
 */
public class RequestFromBillboardHot093 {

	ArrayList<String> htmls= new ArrayList<String>();
	ArrayList<Billboard083> billboards= new ArrayList<Billboard083>();
	boolean isConnection= false;
	
	
	//������ �ʱ�ȭ
	public RequestFromBillboardHot093() {
		htmls.clear();
		billboards.clear();
	}
	
	//���� �ȵ�....
	public ArrayList<Billboard083> getBillboard083s(){
		return billboards;
	}

	public void getAllHtml(String newUrls) {
		htmls.clear();
		URL url= null;
		try {
			url = new URL(newUrls);
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
			
			String line= "";
			while((line= br.readLine())!=null) {
				if(!line.trim().equals("")) {
					htmls.add(line.trim());					
				}
			}
			isConnection = true;
		}catch(Exception e) {
			isConnection= false;
			System.out.println("getAllhtml �Ľ� ����");
		}
	}
	public String getTimeDate(String newUrls) {
		
		String s="";
		URL url= null;
		
		try {
			url= new URL(newUrls);
			BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream(),"euc-kr"),8);
			String line="";
			
			while((line= br.readLine())!= null) {
				if(!line.trim().equals("")) {
					if(line.contains("<time datetime=")) {
						s=line.trim();
						s= s.substring(0,s.indexOf(">")-1);
						s= s.substring(s.indexOf("\"")+1).trim();
						break;
					}
				}
			}
			isConnection= true;
			//System.out.println("��¥: "+s);
			
		}catch(Exception e) {
			isConnection = false;
			System.out.println("������ �Ľ� ����");
		}
		return s;
		
	}
	
	//?? �Ľ� ���� ??
	public synchronized void getBillboardData(String msg) {
		billboards.clear();
		//Billboard083s.clear();
		for(int i=0; i<htmls.size(); i++) {
			
			//�� ������ �����´�.
			String ss= htmls.get(i);
			
			//���忡 class="chart-row"�� ���ԵǾ� �ִ��� Ȯ���Ѵ�.
			if(ss.contains(msg)) {
				//69. �����ϰ� �ִٸ� <article class= "chart-row chart-row--"�� �߶󳽴�.
				String rank= ss.substring(ss.indexOf("chart-row--")+"chart-row--".length());
				rank= rank.substring(0,rank.indexOf("js")-1).trim();
				
				//song hover��  �߶󳽴�
				String song= ss.substring(ss.indexOf("Song Hover-")+"Song Hover-".length());
				//�뷡 ������ ��´�.
				song= song.substring(0, song.indexOf("\"")).trim();
				int j=1;
				String imageurl= htmls.get(i+j);
				while(true) {
					if(imageurl.contains("images/pref_images")) {
						break;
					}else{
						j++;
						imageurl= htmls.get(i+j);
					}
				}
				imageurl= imageurl.substring(imageurl.indexOf("https://"));
				imageurl= imageurl.substring(0,imageurl.indexOf(".jpg")+".jpg".length());
				int k=1;
				String artisturl= htmls.get(i+j+k);
				while(true) {
					if(artisturl.contains("chart-row__artist")) {
						break;
					}else {
						j++;
						artisturl= htmls.get(i+j+k);
					}
				}
				artisturl= artisturl.substring(artisturl.indexOf("https://"));
				artisturl= artisturl.substring(0,artisturl.indexOf("\""));
				String artist= artisturl.substring(artisturl.lastIndexOf("/")+1);
				artist= toArtis(artist);
				int m=1;
				String lastweek= htmls.get(i+j+k+m);
				while(true) {
					if(lastweek.contains("chart-row__last-week")) {
						break;
					}else {
						j++;
						lastweek= htmls.get(i+j+k+m);
					}
				}
				int n=1;
				lastweek= htmls.get(i+j+k+m+n);
				while(true) {
					if(lastweek.contains("chart-row__value")) {
						break;
					}else {
						j++;
						lastweek= htmls.get(i+j+k+m);
					}
				}
				lastweek= lastweek.substring(lastweek.indexOf(">")+1);
				lastweek= lastweek.substring(0,lastweek.indexOf("<")).trim();
				//������ ��ü�� ������ �����Ѵ�.
				
				Billboard083 board= new Billboard083(
						toInt(rank),replace(song),toInt(toStr(lastweek)),
						imageurl,artisturl,artist);
				billboards.add(board);
				
				
			}
		}
	}
	
	public void printHtml() {
		for(String dto:htmls) {
			System.out.println(dto);
		}
	}
	
	public void printBillboard() {
		for(Billboard083 dto: billboards) {
			System.out.println(dto);
		}
	}
	
	
	public String replace(String msg) {
		// TODO Auto-generated method stub
		String ss= msg;
		ss= ss.replaceAll("&#039;", "");
		ss= ss.replaceAll("&amp;", "&");
		ss= ss.replaceAll("&quot;", "\"");
		return ss.trim();
	}

	private int toInt(String msg) {
		// TODO Auto-generated method stub
		return Integer.parseInt(msg==null?"-1":msg.trim());
	}

	private String toStr(String lastweek) {
		// TODO Auto-generated method stub
		return lastweek.contains("--")?101+"":lastweek;
	}

	private String toArtis(String msg) {
		// TODO Auto-generated method stub
		return msg.replaceAll("-", " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestFromBillboardHot093 rfw= new RequestFromBillboardHot093();
		String a="https://www.billboard.com/charts/hot-100/";
		String rs= rfw.getTimeDate(a);
		rs= RestDay075.toWantedDay(rs,1); //1�� ��
		System.out.println(rs);
		rfw.getAllHtml(a+rs);
		String str="<article class= \"chart-row";
		rfw.getBillboardData(str);
		rfw.printBillboard();
	}

}
