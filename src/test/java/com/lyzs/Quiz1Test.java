package com.lyzs;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quiz1Test {
	private Quiz1 quiz1 = new Quiz1();

	@Test
	public void testCalc() {
		assertEquals(0, quiz1.calc(0));
		assertEquals(2, quiz1.calc(1));
		assertEquals(2, quiz1.calc(2));
		assertEquals(4, quiz1.calc(3));
		assertEquals(6, quiz1.calc(4));
		assertEquals(10, quiz1.calc(5));
		assertEquals(16, quiz1.calc(6));
		assertEquals(26, quiz1.calc(7));
		assertEquals(42, quiz1.calc(8));
		assertEquals(68, quiz1.calc(9));
		assertEquals(13530, quiz1.calc(20));
	}

}
