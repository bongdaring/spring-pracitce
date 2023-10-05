package com.poscodx.container.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.poscodx.container.config.videosystem.DVDPlayerConfig;
import com.poscodx.container.videosystem.mixing.DVDConfig;

/**
 * 	<----- JavaConfig1, JavaConfig2
 * 	import
 * 
 * 	JavaConfig1 + JavaConfig2
 */
@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {
	

}
