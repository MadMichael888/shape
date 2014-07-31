package com.jibe.myan.comparators;

import java.util.Comparator;
import java.util.List;

import com.jibe.myan.model.Shape;

public class ClassicShapeSort {

	public static List<Shape> sort(List<Shape> list) {
		if(list == null || list.size() < 1) {
			return list;
		}
		
		list.sort(new ClassicShapeComparator());
		return list;
	}
	
	private static class ClassicShapeComparator implements Comparator<Shape> {

		@Override
		public int compare(Shape o1, Shape o2) {
			if(o1 == null) {
				return -1;
			}
			
			if(o2 == null) {
				return 1;
			}
			
			int areaComparison = o1.getArea().compareTo(o2.getArea());
			if(areaComparison != 0) {
				return areaComparison;
			}
			
			return o1.getCircumference().compareTo(o2.getCircumference());
		}

	}

}
