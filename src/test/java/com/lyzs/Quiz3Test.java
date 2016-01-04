package com.lyzs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.Sets;

public class Quiz3Test {
	private Quiz3 quiz3 = new Quiz3();

	@Test
	public void testCalc() {
		assertEquals(Sets.newHashSet(153, 370, 371, 407), quiz3.calc());
	}

}
