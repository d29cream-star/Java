package com.kh.mus.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.mus.exception.DuplicateNameException;
import com.kh.mus.exception.InvalidPlaytimeException;
import com.kh.mus.exception.MusicNotFoundException;
import com.kh.mus.model.dto.Music;

public class MusicService {

	List<Music> musics = new ArrayList<>();

	{
		musics.add(new Music("난춘", "새소년", 352, "인디"));
		musics.add(new Music("Drowning", "WOODZ", 404, "락"));
		musics.add(new Music("파도", "새소년", 442, "인디"));
		musics.add(new Music("Blue Moon", "Billie Holiday", 401, "재즈"));
	}

	public List<Music> read() {
		return new ArrayList<>(musics);
		//return musics;
	}

	public void save(Music m) {
		musics.add(m);

	}

	public void nameCheck(String name) {
		for (Music m : musics) {
			if (m.getName().equals(name)) {
				throw new DuplicateNameException("이미 등록된 이름입니다.");
			}
		}
	}
	public void playtimeCheck(int playtime) {
		if(playtime >500) {
			throw new InvalidPlaytimeException("너무 긴 음악입니다.");
		}
	}

	public void delete(String name) {
		for (int i = 0; i < musics.size(); i++) {
			if (musics.get(i).getName().equals(name)) {
				musics.remove(i);
				return;
			}
		}
		throw new MusicNotFoundException("해당 음악을 찾을 수 없습니다.");
	}

	public List<Music> findByGenre(String genre) {
		return musics.stream().filter(m -> m.getGenre().equals(genre)).toList();

	}

	public void update(String name, int newPlaytime) {
		for (Music m : musics) {
			if (m.getName().equals(name)) {
				m.setPlaytime(newPlaytime);
				return;
			}
		}
		throw new MusicNotFoundException("해당 음악을 찾을 수 없습니다.");

	}
}
