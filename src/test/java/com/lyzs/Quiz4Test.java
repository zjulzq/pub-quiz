package com.lyzs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Quiz4Test {
	private Quiz4 quiz4 = new Quiz4();

	@Test
	public void testCalc() {
		Multiset<Integer> multiset = HashMultiset.create();
		assertEquals(multiset, quiz4.calc(1));
		multiset.clear();
		multiset.add(2);
		assertEquals(multiset, quiz4.calc(2));
		multiset.clear();
		multiset.add(3);
		assertEquals(multiset, quiz4.calc(3));
		multiset.clear();
		multiset.add(2);
		multiset.add(2);
		assertEquals(multiset, quiz4.calc(4));
		multiset.clear();
		multiset.add(2);
		multiset.add(3);
		multiset.add(3);
		multiset.add(5);
		assertEquals(multiset, quiz4.calc(90));
		multiset.clear();
		multiset.add(2);
		multiset.add(2);
		multiset.add(2);
		multiset.add(5);
		multiset.add(5);
		multiset.add(5);
		assertEquals(multiset, quiz4.calc(1000));
		multiset.clear();
		multiset.add(2);
		multiset.add(2);
		multiset.add(2);
		multiset.add(2);
		multiset.add(2);
		multiset.add(2);
		multiset.add(3);
		multiset.add(643);
		assertEquals(multiset, quiz4.calc(123456));
	}

}
