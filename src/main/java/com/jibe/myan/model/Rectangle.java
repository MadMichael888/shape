package com.jibe.myan.model;

import java.math.BigDecimal;

public class Rectangle extends Shape {

	private BigDecimal width;
	private BigDecimal height;
	private BigDecimal area;
	private BigDecimal circumference;

	private Rectangle() {
		super();
	}

	public Rectangle(BigDecimal width, BigDecimal height) {
		super();
		assertPositiveValue(width, "Width");
		assertPositiveValue(height, "Height");
		this.width = width;
		this.height = height;
	}


	public BigDecimal getWidth() {
		return width;
	}

	public BigDecimal getHeight() {
		return height;
	}

	@Override
	public BigDecimal getArea() {
		if(this.area != null) {
			return this.area;
		}
		return scale(width.multiply(height));
	}

	@Override
	public BigDecimal getCircumference() {
		if(this.circumference != null) {
			return this.circumference;
		}
		return scale(width.add(height).multiply(new BigDecimal("2")));
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Rectangle)) {
			return false;
		}
		return this.width.compareTo(((Rectangle)obj).getWidth()) == 0
				&& this.height.compareTo(((Rectangle)obj).getHeight()) == 0;
	}

}
