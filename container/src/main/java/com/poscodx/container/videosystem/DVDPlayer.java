package com.poscodx.container.videosystem;

import org.springframework.stereotype.Component;

@Component
public class DVDPlayer {
	private DigitalVideoDisc dvd;
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public String play() {
		return dvd.play();
	}

}
