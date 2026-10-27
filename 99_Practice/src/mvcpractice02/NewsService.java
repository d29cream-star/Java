package mvcpractice02;

import java.util.ArrayList;
import java.util.List;

public class NewsService {

	private List<News> news = new ArrayList<>();
	
	public void create(String name, String publisher) {
		news.add(new News("참여연대: 정부, 가상자산 과정 예정대로 시행해야", "연합뉴스"));
		news.add(new News("여군될래요, 작년 2만명이 달려갔다.", "헤럴드 경제"));
		news.add(new News(name, publisher));
	}
	public List<News> read() {
		return news;
	
	}
	
	public void update(String name, String updateName, String publisher) {
		for(int i = 0; i < news.size(); i ++) {
			if(news.get(i).getName().equals(name)){
				news.set( i , new News(updateName, publisher));
			}break;
		}
	}
	public void delete(String name) {
		for(int i = 0; i < news.size(); i ++) {
			if(news.get(i).getName().equals(name)) {
				news.remove(i);break;
			}
		}
	}
	
}
