package com.jibe.myan.comparators;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.jibe.myan.model.Shape;

public class StreamShapeSort {

	public static List<Shape> sort(List<Shape> list) {
		if(list == null || list.size() < 1) {
			return list;
		}
		
		Comparator<Shape> compareByArea = (s1, s2) -> s1.getArea().compareTo(s2.getArea());
		Comparator<Shape> compareByCircumference = (s1, s2) -> s1.getCircumference().compareTo(s2.getCircumference());
		
		List<Shape> collectedList = list.stream().sorted(compareByArea.thenComparing(compareByCircumference))
													.collect(Collectors.toList());
		
		return collectedList;
	}
	

}
