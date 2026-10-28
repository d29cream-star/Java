package com.kh.mus.controller;

import java.util.List;

import com.kh.mus.model.dto.Music;
import com.kh.mus.model.service.MusicService;

public class MusController {

	private MusicService ms = new MusicService();
	
	public List<Music> read() {
		return ms.read();
	}
	public void save(String name, String singer, int playtime, String genre) {
		ms.save(new Music(name,singer,playtime,genre));
	}
	
}
