package com.lyzs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Quiz5Test {
	private Quiz5 quiz5 = new Quiz5();

	@Test
	public void testCalc() {
		assertEquals(1, quiz5.calc(1, 1));
		assertEquals(1, quiz5.calc(1, 2));
		assertEquals(1, quiz5.calc(2, 3));
		assertEquals(2, quiz5.calc(2, 4));
		assertEquals(5, quiz5.calc(5, 15));
		assertEquals(4, quiz5.calc(8, 12));
	}

}
