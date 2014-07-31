package com.jibe.myan.test;

import java.math.BigDecimal;

import com.jibe.myan.model.Circle;
import com.jibe.myan.model.Rectangle;
import com.jibe.myan.model.Triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestConstructor 
    extends TestCase
{

	public TestConstructor( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestConstructor.class );
    }

    public void testTrianle()
    {
    	try {
    		Triangle t = new Triangle(null, new BigDecimal(4), new BigDecimal(5));
    		assertTrue(false);
    	} catch (IllegalArgumentException e) {
    		assertTrue(true);
    	}
    }

    public void testRectangle()
    {
    	try {
    		Rectangle t = new Rectangle(new BigDecimal(-3), new BigDecimal(4));
    		assertTrue(false);
    	} catch (IllegalArgumentException e) {
    		assertTrue(true);
    	}
    }

}
