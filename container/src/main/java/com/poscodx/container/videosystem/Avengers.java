package com.poscodx.container.videosystem;

import org.springframework.stereotype.Component;

@Component
public class Avengers implements DigitalVideoDisc {

	private String title = "Avengers";
	private String studio = "MARVEL";
	
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Playing Movie "+ studio +"'s "+ title;
	}

}
