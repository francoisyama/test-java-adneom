package com.adneom.test.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.adneom.test.api.ListsOperator;

public class ArrayListsOperator implements ListsOperator {

	@Override
	public List<List<Integer>> partition(List<Integer> liste, int taille) {
		Map<Integer, List<Integer>> groups = liste.stream().collect(Collectors.groupingBy(s -> (s - 1) / taille));
		return new ArrayList<>(groups.values());
	}
	
	

}
