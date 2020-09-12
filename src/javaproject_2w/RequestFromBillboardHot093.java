package javaproject_2w;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/*
 * 어려워요!!
 * 이번 주 빌보드 차트를 파싱하여 객체로 저장하기
 * 이번 주 빌보드 차트를 파싱하여 객체로 저장해 보자
 * 힌트: String은 특정 문자열의 위치를 찾는 indexOf,자르는 subString을 이용하여 날짜를 찾는다. 
 *
 */
public class RequestFromBillboardHot093 {

	ArrayList<String> htmls= new ArrayList<String>();
	ArrayList<Billboard083> billboards= new ArrayList<Billboard083>();
	boolean isConnection= false;
	
	
	//생성자 초기화
	public RequestFromBillboardHot093() {
		htmls.clear();
		billboards.clear();
	}
	
	//이해 안됨....
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
			System.out.println("getAllhtml 파싱 에러");
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
			//System.out.println("날짜: "+s);
			
		}catch(Exception e) {
			isConnection = false;
			System.out.println("빌보드 파싱 에러");
		}
		return s;
		
	}
	
	//?? 파싱 과정 ??
	public synchronized void getBillboardData(String msg) {
		billboards.clear();
		//Billboard083s.clear();
		for(int i=0; i<htmls.size(); i++) {
			
			//한 문장을 가져온다.
			String ss= htmls.get(i);
			
			//문장에 class="chart-row"가 포함되어 있는지 확인한다.
			if(ss.contains(msg)) {
				//69. 포함하고 있다면 <article class= "chart-row chart-row--"를 잘라낸다.
				String rank= ss.substring(ss.indexOf("chart-row--")+"chart-row--".length());
				rank= rank.substring(0,rank.indexOf("js")-1).trim();
				
				//song hover를  잘라낸다
				String song= ss.substring(ss.indexOf("Song Hover-")+"Song Hover-".length());
				//노래 제목을 얻는다.
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
				//빌보드 객체에 정보를 저장한다.
				
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
		rs= RestDay075.toWantedDay(rs,1); //1주 전
		System.out.println(rs);
		rfw.getAllHtml(a+rs);
		String str="<article class= \"chart-row";
		rfw.getBillboardData(str);
		rfw.printBillboard();
	}

}
