package com.lyzs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.common.collect.Sets;

public class Quiz2Test {
	private Quiz2 quiz2 = new Quiz2();

	@Test
	public void testCalc() {
		assertEquals(Sets.newHashSet(), quiz2.calc(1, 2));
		assertEquals(Sets.newHashSet(), quiz2.calc(1, 2));
		assertEquals(Sets.newHashSet(2), quiz2.calc(1, 3));
		assertEquals(Sets.newHashSet(2, 3), quiz2.calc(1, 4));
		assertEquals(Sets.newHashSet(2, 3), quiz2.calc(1, 5));
		assertEquals(Sets.newHashSet(2, 3, 5), quiz2.calc(1, 6));
		assertEquals(Sets.newHashSet(2, 3, 5), quiz2.calc(1, 7));
		assertEquals(Sets.newHashSet(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97), quiz2.calc(1, 100));
		assertEquals(Sets.newHashSet(101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199),
				quiz2.calc(100, 200));
	}

}
