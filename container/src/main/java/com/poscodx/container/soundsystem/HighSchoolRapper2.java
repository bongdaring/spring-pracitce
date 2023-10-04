package com.poscodx.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper2 implements CompactDisc {

	private String artist;
	
	@Override
	public String play() {
		
		return "Playing 붕붕 by "+artist;
	}

}
