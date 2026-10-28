package com.kh.mus.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.mus.model.dto.Music;

public class MusicService {

	List<Music> musics = new ArrayList<>();
	
	{
		musics.add(new Music("난춘","새소년", 352, "인디"));
		musics.add(new Music("Drowning", "WOODZ", 404, "락"));
		musics.add(new Music("파도", "새소년", 442, "인디"));
		musics.add(new Music("Blue Moon", "Billie Holiday", 401, "재즈"));
	}
	
	public List<Music> read() {
		return musics;
	}
	
	public void save(Music m) {
		
		
	}
	
	
}
