package javaproject_2w;

import java.io.Serializable;

/*
 * 빌보드 차트 정보를 빌보드 저장 객체(DTO)에 저장하기
 * 빌보드 차트 정보를 한 번에 저장하고 전송하는 방법을 익혀 보자.
 * 힌트: 빌보드 차트를 저장하는 DTO(Data Transfer Object)를 만든다. 
 * 
 */

public class Billboard083 implements Serializable{
	//데이터는 private으로 보호하고, 멤버필드를 가져오고 저장하기 위해 get/set 메서드를 만든다.
	private int rank; //순위
	private String song; //곡명
	private int lastweek; //전 주 순위
	private String imagesrc; //가수 사진
	private String artistsrc; //가수 정보
	private String artist; //가수 이름
	
	//기본 생성자 generate Constructors from superclass
	public Billboard083() {}
	
	//초기화할 생성자를 오버로딩한다. generate Constructors using Fields
	public Billboard083(int rank, String song, int lastweek, String imagesrc, 
			String artistsrc, String artist) {
		super();
		this.rank=rank;
		this.song=song;
		this.lastweek=lastweek;
		this.imagesrc=imagesrc;
		this.artistsrc=artistsrc;
		this.artist= artist;	
	}
	//초기화할 생성자를 오버로딩한다.
	public Billboard083(int rank, String song, int lastweek, String imagesrc, String artist) {
		super();
		this.rank=rank;
		this.song=song;
		this.lastweek=lastweek;
		this.imagesrc=imagesrc;
		this.artist= artist;	
	}
	
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public int getLastweek() {
		return lastweek;
	}

	public void setLastweek(int lastweek) {
		this.lastweek = lastweek;
	}

	public String getImagesrc() {
		return imagesrc;
	}

	public void setImagesrc(String imagesrc) {
		this.imagesrc = imagesrc;
	}

	public String getArtistsrc() {
		return artistsrc;
	}

	public void setArtistsrc(String artistsrc) {
		this.artistsrc = artistsrc;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//멤버필드를 살펴볼 수 있도록 오버라이딩한다.
	@Override
	public String toString() {
		return "[rank=" + rank + ", song=" + song + ", lastweek="
				+ lastweek + ", imagesrc=" + imagesrc 
				 + ", artist=" + artist+"]";
	}
	
	
}
