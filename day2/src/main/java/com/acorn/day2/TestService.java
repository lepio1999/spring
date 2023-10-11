package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TestService {

	public ArrayList<String> getDan(int dan) {
		ArrayList<String> danList = new ArrayList<String>();
		for (int i = 1; i <= 9; i++) {
			danList.add(dan + "X" + i + "=" + dan * i); // 3X1=3;
		}

		return danList;
	}
	
	public ArrayList<String> getMovieList(){
		ArrayList<String> movieList = new ArrayList<String>();
		movieList.add("터미네이터");
		movieList.add("아바타");
		movieList.add("인터스텔라");
		
		return movieList;
	}

}
