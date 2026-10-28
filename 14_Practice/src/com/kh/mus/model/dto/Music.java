package com.kh.mus.model.dto;

public class Music {

	private String name;
	private String singer;
	private int playtime;
	private String genre;
	
	public Music(String name, String singer, int playtime, String genre) {
		super();
		this.name = name;
		this.singer = singer;
		this.playtime = playtime;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPlaytime() {
		return playtime;
	}
	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Music [name=" + name + ", singer=" + singer + ", playtime=" + playtime + ", genre=" + genre + "]";
	}

	
}
