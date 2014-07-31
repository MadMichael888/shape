package com.jibe.myan.model;

import java.math.BigDecimal;

public class Triangle extends Shape {

	private BigDecimal side1;
	private BigDecimal side2;
	private BigDecimal side3;
	private BigDecimal area;
	private BigDecimal circumference;

	private Triangle() {
		super();
	}

	public Triangle(BigDecimal side1, BigDecimal side2, BigDecimal side3) {
		super();
		assertPositiveValue(side1, "side1");
		assertPositiveValue(side2, "side2");
		assertPositiveValue(side3, "side3");
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}


	public BigDecimal getSide1() {
		return side1;
	}

	public BigDecimal getSide2() {
		return side2;
	}

	public BigDecimal getSide3() {
		return side3;
	}

	@Override
	public BigDecimal getArea() {
		if(this.area != null) {
			return this.area;
		}
		BigDecimal s = side1.add(side2).add(side3).multiply(new BigDecimal("0.5"));
		double area = Math.sqrt(s.multiply(s.subtract(side1)).multiply(s.subtract(side2)).multiply(s.subtract(side3)).doubleValue());
		return scale(area);
	}

	@Override
	public BigDecimal getCircumference() {
		if(this.circumference != null) {
			return this.circumference;
		}
		return scale(side1.add(side2).add(side3));
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3="
				+ side3 + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Triangle)) {
			return false;
		}
		return this.side1.compareTo(((Triangle)obj).getSide1()) == 0
				&& this.side2.compareTo(((Triangle)obj).getSide2()) == 0
				&&	this.side3.compareTo(((Triangle)obj).getSide3()) == 0;
	}


}
