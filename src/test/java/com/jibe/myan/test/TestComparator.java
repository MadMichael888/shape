package com.jibe.myan.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.jibe.myan.comparators.ClassicShapeSort;
import com.jibe.myan.comparators.StreamShapeSort;
import com.jibe.myan.model.Circle;
import com.jibe.myan.model.Rectangle;
import com.jibe.myan.model.Shape;
import com.jibe.myan.model.Triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestComparator 
    extends TestCase
{

	public TestComparator( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestComparator.class );
    }

    public void testClassicCompatator()
    {
    	Circle c1 = new Circle(new BigDecimal(1));
    	Circle c2 = new Circle(new BigDecimal(2.5));
    	Rectangle r = new Rectangle(new BigDecimal(1), new BigDecimal(2));
    	Triangle t = new Triangle(new BigDecimal(3), new BigDecimal(4), new BigDecimal(4));

    	assertEquals(0, new BigDecimal("3.1416").compareTo(c1.getArea()));
    	assertEquals(0, new BigDecimal("6.2832").compareTo(c1.getCircumference()));
    	assertEquals(0, new BigDecimal("19.6350").compareTo(c2.getArea()));
    	assertEquals(0, new BigDecimal("15.7080").compareTo(c2.getCircumference()));
    	assertEquals(0, new BigDecimal("2").compareTo(r.getArea()));
    	assertEquals(0, new BigDecimal("6").compareTo(r.getCircumference()));
    	assertEquals(0, new BigDecimal("5.5621").compareTo(t.getArea()));
    	assertEquals(0, new BigDecimal("11").compareTo(t.getCircumference()));

    	List<Shape> list = Arrays.asList(c1, c2, r, t);
    	list = ClassicShapeSort.sort(list);
    	assertEquals(r, list.get(0));
    	assertEquals(c1, list.get(1));
    	assertEquals(t, list.get(2));
    	assertEquals(c2, list.get(3));
    	
    }

    public void testStreamCompatator()
    {
    	Circle c1 = new Circle(new BigDecimal(1));
    	Circle c2 = new Circle(new BigDecimal(2.5));
    	Rectangle r = new Rectangle(new BigDecimal(1), new BigDecimal(2));
    	Triangle t = new Triangle(new BigDecimal(3), new BigDecimal(4), new BigDecimal(4));

    	assertEquals(0, new BigDecimal("3.1416").compareTo(c1.getArea()));
    	assertEquals(0, new BigDecimal("6.2832").compareTo(c1.getCircumference()));
    	assertEquals(0, new BigDecimal("19.6350").compareTo(c2.getArea()));
    	assertEquals(0, new BigDecimal("15.7080").compareTo(c2.getCircumference()));
    	assertEquals(0, new BigDecimal("2").compareTo(r.getArea()));
    	assertEquals(0, new BigDecimal("6").compareTo(r.getCircumference()));
    	assertEquals(0, new BigDecimal("5.5621").compareTo(t.getArea()));
    	assertEquals(0, new BigDecimal("11").compareTo(t.getCircumference()));

    	List<Shape> list = Arrays.asList(c1, c2, r, t);
    	list = StreamShapeSort.sort(list);
    	assertEquals(r, list.get(0));
    	assertEquals(c1, list.get(1));
    	assertEquals(t, list.get(2));
    	assertEquals(c2, list.get(3));
    	
    }

    public void testClassicCompatatorSecondCondition()
    {
    	Rectangle r = new Rectangle(new BigDecimal(3), new BigDecimal(2));
    	Triangle t = new Triangle(new BigDecimal(3), new BigDecimal(4), new BigDecimal(5));

    	assertEquals(0, new BigDecimal("6").compareTo(r.getArea()));
    	assertEquals(0, new BigDecimal("10").compareTo(r.getCircumference()));
    	assertEquals(0, new BigDecimal("6").compareTo(t.getArea()));
    	assertEquals(0, new BigDecimal("12").compareTo(t.getCircumference()));

    	List<Shape> list = Arrays.asList(t, r);
    	list = ClassicShapeSort.sort(list);
    	assertEquals(r, list.get(0));
    	assertEquals(t, list.get(1));
    	
    }

    public void testStreamCompatatorSecondCondition()
    {
    	Rectangle r = new Rectangle(new BigDecimal(3), new BigDecimal(2));
    	Triangle t = new Triangle(new BigDecimal(3), new BigDecimal(4), new BigDecimal(5));

    	assertEquals(0, new BigDecimal("6").compareTo(r.getArea()));
    	assertEquals(0, new BigDecimal("10").compareTo(r.getCircumference()));
    	assertEquals(0, new BigDecimal("6").compareTo(t.getArea()));
    	assertEquals(0, new BigDecimal("12").compareTo(t.getCircumference()));

    	List<Shape> list = Arrays.asList(t, r);
    	list = StreamShapeSort.sort(list);
    	assertEquals(r, list.get(0));
    	assertEquals(t, list.get(1));
    	
    }

}
