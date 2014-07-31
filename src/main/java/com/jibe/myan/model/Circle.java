package com.jibe.myan.model;

import java.math.BigDecimal;

public class Circle extends Shape {

	private BigDecimal radius;
	private BigDecimal area;
	private BigDecimal circumference;

	private Circle() {
		super();
	}

	public Circle(BigDecimal radius) {
		super();
		assertPositiveValue(radius, "Radius");
		this.radius = radius;
	}

	public BigDecimal getRadius() {
		return radius;
	}

	@Override
	public BigDecimal getArea() {
		if(this.area != null) {
			return this.area;
		}
		return scale(Math.PI * radius.multiply(radius).doubleValue());
	}

	@Override
	public BigDecimal getCircumference() {
		if(this.circumference != null) {
			return this.circumference;
		}
		return scale(2 * Math.PI * radius.doubleValue());
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Circle)) {
			return false;
		}
		return this.radius.compareTo(((Circle)obj).getRadius()) == 0;
	}

	
}
