package com.adneom.test.impl.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.adneom.test.impl.ArrayListsOperator;

@RunWith(Parameterized.class)
public class ArrayListsOperatorTest {
	
	private static final List<Integer> TESTED_LIST = Arrays.asList(1, 2, 3, 4, 5);
	private List<Integer> testedList;
	private int testedSize = 2;
	private List<List<Integer>> expectedList;
	private ArrayListsOperator arrayListsOperator;
	
	@Before
	public void init() {
		arrayListsOperator = new ArrayListsOperator();
	}
	
	public ArrayListsOperatorTest(List<Integer> testedList, int testedSize, List<List<Integer>> expectedList) {
		this.testedList = testedList;
		this.testedSize = testedSize;
		this.expectedList = expectedList;
	}
	
	@Parameters
	public static Collection testedValues() {
		return Arrays.asList(new Object [][] {
			{TESTED_LIST, 2,  Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5))},
			{TESTED_LIST, 3, Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5))},
			{TESTED_LIST, 1, Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(4), Arrays.asList(5))}
		});
	}
	
	@Test
	public void testPartition() {
		assertEquals(expectedList, arrayListsOperator.partition(testedList, testedSize));
	}

}
