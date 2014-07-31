package com.jibe.myan.model;

import java.math.BigDecimal;

public abstract class Shape {
	
	public static final int DEFAULT_SCALE = 4;

	abstract public BigDecimal getArea();

	abstract public BigDecimal getCircumference();

	private int scale = DEFAULT_SCALE;
	
	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public BigDecimal scale(BigDecimal result) {
		if(result == null)
			return null;
		return result.setScale(getScale(), BigDecimal.ROUND_HALF_UP);
	}

	public BigDecimal scale(double result) {
		return new BigDecimal(result).setScale(getScale(), BigDecimal.ROUND_HALF_UP);
	}

	public void assertPositiveValue(BigDecimal value, String property) {
		if(value == null || value.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException(property + " can't null or negative.");
		}
	}
		
}
