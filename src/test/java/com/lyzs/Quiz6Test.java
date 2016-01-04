package com.lyzs;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class Quiz6Test {
	private Quiz6 quiz6 = new Quiz6();

	@Test
	public void testSort() {
		assertEquals(Lists.newArrayList(1), quiz6.sort(Lists.newArrayList(1)));
		assertEquals(Lists.newArrayList(1, 2), quiz6.sort(Lists.newArrayList(2, 1)));
		assertEquals(Lists.newArrayList(1, 2, 3), quiz6.sort(Lists.newArrayList(2, 1, 3)));
		assertEquals(Lists.newArrayList(1, 2, 3, 4, 5, 6, 7), quiz6.sort(Lists.newArrayList(2, 1, 3, 7, 5, 6, 4)));
		List<Integer> list = new ArrayList<>();
		int count = 1000000;
		for (int i = 0; i < count; i++) {
			list.add((int) (Math.random() * count));
		}
		quiz6.sort(list);
	}

}
