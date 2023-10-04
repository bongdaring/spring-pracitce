package com.poscodx.container.user.test;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
	public static void main(String[] args) {
		testJavaConfigText();
	}

	private static void testJavaConfigText() {
		new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
