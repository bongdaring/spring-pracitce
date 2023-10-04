package com.poscodx.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements CompactDisc{
	@Autowired
	public CompactDisc cd;
	
	public String play() {
		return cd.play();
	}
}

