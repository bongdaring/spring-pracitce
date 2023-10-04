package com.poscodx.container.videosystem;

public class Avengers implements DigitalVideoDisc {

	private String title = "";
	private String studio = "MARVEL";
	
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "playing Movie "+ studio +"'s "+ title;
	}

}
