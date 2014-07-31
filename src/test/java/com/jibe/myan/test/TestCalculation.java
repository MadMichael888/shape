package com.jibe.myan.test;

import java.math.BigDecimal;

import com.jibe.myan.model.Circle;
import com.jibe.myan.model.Rectangle;
import com.jibe.myan.model.Triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCalculation 
    extends TestCase
{

	public TestCalculation( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCalculation.class );
    }

    public void testTrianle()
    {
    	Triangle t = new Triangle(new BigDecimal(3), new BigDecimal(4), new BigDecimal(5));
    	assertEquals(0, new BigDecimal(6).compareTo( t.getArea()));
    	assertEquals(0, new BigDecimal(12).compareTo(t.getCircumference()));
    }

    public void testRectangle()
    {
    	Rectangle t = new Rectangle(new BigDecimal(3), new BigDecimal(4));
    	assertEquals(0, new BigDecimal(12).compareTo( t.getArea()));
    	assertEquals(0, new BigDecimal(14).compareTo(t.getCircumference()));
    }

    public void testCircle()
    {
    	Circle t = new Circle(new BigDecimal(3));
    	assertEquals(0, new BigDecimal("28.2743").compareTo( t.getArea()));
    	assertEquals(0, new BigDecimal("18.8496").compareTo(t.getCircumference()));
    }

}
