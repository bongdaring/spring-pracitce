package com.poscodx.container.videosystem.mixing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.poscodx.container.videosystem.DVDPlayer;
import com.poscodx.container.videosystem.VideoSystemConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {VideoSystemConfig.class})
public class DVDPlayerMixingConfigTest02 {
	@Autowired
	DVDPlayer dvdPlayer;
	
	@Test
	public void testPlay() {
		assertEquals("Playing Movie MARVEL's Avengers Infinite War", dvdPlayer.play());
	}
}
