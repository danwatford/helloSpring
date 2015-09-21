package com.foomoo.example.spring.helloSpring;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class ChatterBoxTest {
	private static final String SAY_STRING = "Hello, Spring World!";
	private static final String lineSeparator = System
			.getProperty("line.separator");

	@Test
	public void testSaySomething() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ChatterBox chatterBox = new ChatterBox();
		chatterBox.setOutputStream(baos);

		chatterBox.saySomething(SAY_STRING);

		assertEquals(SAY_STRING + lineSeparator, baos.toString());
	}

	@Test
	public void testSaySaySomething() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ChatterBox chatterBox = new ChatterBox();
		chatterBox.setOutputStream(baos);

		chatterBox.saySaySomething(SAY_STRING);

		assertEquals(SAY_STRING + SAY_STRING + lineSeparator, baos.toString());
	}
}
