package javaproject_2w;

import java.io.Serializable;

/*
 * ������ ��Ʈ ������ ������ ���� ��ü(DTO)�� �����ϱ�
 * ������ ��Ʈ ������ �� ���� �����ϰ� �����ϴ� ����� ���� ����.
 * ��Ʈ: ������ ��Ʈ�� �����ϴ� DTO(Data Transfer Object)�� �����. 
 * 
 */

public class Billboard083 implements Serializable{
	//�����ʹ� private���� ��ȣ�ϰ�, ����ʵ带 �������� �����ϱ� ���� get/set �޼��带 �����.
	private int rank; //����
	private String song; //���
	private int lastweek; //�� �� ����
	private String imagesrc; //���� ����
	private String artistsrc; //���� ����
	private String artist; //���� �̸�
	
	//�⺻ ������ generate Constructors from superclass
	public Billboard083() {}
	
	//�ʱ�ȭ�� �����ڸ� �����ε��Ѵ�. generate Constructors using Fields
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
	//�ʱ�ȭ�� �����ڸ� �����ε��Ѵ�.
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
	
	//����ʵ带 ���캼 �� �ֵ��� �������̵��Ѵ�.
	@Override
	public String toString() {
		return "[rank=" + rank + ", song=" + song + ", lastweek="
				+ lastweek + ", imagesrc=" + imagesrc 
				 + ", artist=" + artist+"]";
	}
	
	
}
